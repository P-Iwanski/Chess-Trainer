package pl.coderslab.chesstrainer.apiClient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import pl.coderslab.chesstrainer.apiClient.dTo.GamesDto;
import pl.coderslab.chesstrainer.apiClient.dTo.OpenGamesDto;
import pl.coderslab.chesstrainer.dao.BlackGameDao;
import pl.coderslab.chesstrainer.dao.WhiteGameDao;
import pl.coderslab.chesstrainer.model.BlackGame;
import pl.coderslab.chesstrainer.model.WhiteGame;
import pl.coderslab.chesstrainer.service.CurrentUser;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class ChessClient {
    @Autowired
    private WebClient.Builder webClientBuider;

    @Autowired
    private BlackGameDao bDao;
    @Autowired
    private WhiteGameDao wDao;

    public List<GamesDto> getGamesForPlayerBlack(String username, String ECO, CurrentUser user1) {
        List<GamesDto> blackGames = new ArrayList<>();
        List<OpenGamesDto> blackGamesList = new ArrayList<>();
        List<GamesDto> blackGamesLoseInThisEco = new ArrayList<>();
        List<GamesDto> blackGamesWinInThisEco = new ArrayList<>();
        List<GamesDto> blackGamesInThisEco = new ArrayList<>();

        //Here We take Data from lichess. Parameter is username from form. We need Data in NDJSON format.
        //It is 200 games so this is 200 OpenGames Object.
        blackGamesList = webClientBuider.build()
                .get()
                .uri("https://lichess.org/api/games/user/{username}?color=black&opening=true&max=2000", username)
                .headers(h -> h.setBearerAuth("lip_THtEx4mgz31Dr3En3HaC"))
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_NDJSON_VALUE)
                .accept(MediaType.APPLICATION_NDJSON)
                .retrieve()
                .bodyToFlux(OpenGamesDto.class)
                .collectList().block();

        //We have 200 Object, but We don't need all information. Here We take Data We need. ECO, name of Opening, and rating differences.

        for (int i = 0; i < blackGamesList.size() - 1; i++) {
            if (blackGamesList.get(i).getOpening() != null) {
                blackGames.add(GamesDto.builder()
                        .eco(blackGamesList.get(i).getOpening().getEco())
                        .opening(blackGamesList.get(i).getOpening().getName())
                        .ratingDiff(blackGamesList.get(i).getPlayers().getBlack().getRatingDiff())
                        .build());
            }
        }
        //We add the games to the list in the ECO provided by user.

        for (int i = 0; i < blackGames.size() - 1; i++) {
            if (blackGames.get(i).getEco().equals(ECO)) {
                blackGamesInThisEco.add(blackGames.get(i));
            }

        }
        //We add lose games to the list of lost games and win games to the list of won games.
        for (int j = 0; j < blackGamesInThisEco.size() - 1; j++) {
            if (blackGamesInThisEco.get(j).getRatingDiff() < 0) {
                blackGamesLoseInThisEco.add(blackGames.get(j));
            } else {
                blackGamesWinInThisEco.add(blackGames.get(j));
            }
        }

        //We add data to database
        BlackGame bGame = new BlackGame();
        if (user1.getUser().getLichessNick().equals(username)) {
            bGame.setEco(ECO);
            bGame.setQuantityOfFailedGames(blackGamesLoseInThisEco.size());
            bGame.setQuantityOfSuccessfulGames(blackGamesWinInThisEco.size());
            bGame.setUser(user1.getUser());
            bDao.save(bGame);
        }
        return blackGamesInThisEco;

    }

    public List<GamesDto> getGamesForPlayerWhite(String username, String ECO, CurrentUser user1) {
        List<GamesDto> whiteGames = new ArrayList<>();
        List<OpenGamesDto> whiteGamesList = new ArrayList<>();
        List<GamesDto> whiteGamesLoseInThisEco = new ArrayList<>();
        List<GamesDto> whiteGamesInThisEco = new ArrayList<>();
        List<GamesDto> whiteGamesWinInThisEco = new ArrayList<>();

        //Here We take Data from lichess. Parameter is username from form. We need Data in NDJSON format.
        //It is 200 games so this is 200 OpenGames Object.
        whiteGamesList = webClientBuider.build()
                .get()
                .uri("https://lichess.org/api/games/user/{username}?color=white&opening=true&max=2000", username)
                .headers(h -> h.setBearerAuth("lip_THtEx4mgz31Dr3En3HaC"))
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_NDJSON_VALUE)
                .accept(MediaType.APPLICATION_NDJSON)
                .retrieve()
                .bodyToFlux(OpenGamesDto.class)
                .collectList().block();


        //We have 200 Object, but We don't need all information. Here We take Data We need. ECO, name of Opening, and rating differences.
        for (int i = 0; i < whiteGamesList.size() - 1; i++) {
            if (whiteGamesList.get(i).getOpening() != null) {
                whiteGames.add(GamesDto.builder()
                        .eco(whiteGamesList.get(i).getOpening().getEco())
                        .opening(whiteGamesList.get(i).getOpening().getName())
                        .ratingDiff(whiteGamesList.get(i).getPlayers().getBlack().getRatingDiff())
                        .build());
            }
        }
        //We add the games to the list in the ECO provided by user.
        for (int i = 0; i < whiteGames.size() - 1; i++) {
            if (whiteGames.get(i).getEco().equals(ECO)) {
                whiteGamesInThisEco.add(whiteGames.get(i));
            }

        }
        //We add lose games to the list of lost games and win games to the list of won games.
        for (int j = 0; j < whiteGamesInThisEco.size() - 1; j++) {
            if (whiteGamesInThisEco.get(j).getRatingDiff() < 0) {
                whiteGamesLoseInThisEco.add(whiteGames.get(j));
            } else {
                whiteGamesWinInThisEco.add(whiteGames.get(j));
            }
        }
        //We add data to database
        WhiteGame wGame = new WhiteGame();
        if (user1.getUser().getLichessNick().equals(username)) {
            wGame.setEco(ECO);
            wGame.setQuantityOfFailedGames(whiteGamesLoseInThisEco.size());
            wGame.setQuantityOfSuccessfulGames(whiteGamesWinInThisEco.size());
            wGame.setUser(user1.getUser());
            wDao.save(wGame);
        }
        return whiteGamesInThisEco;
    }
}


