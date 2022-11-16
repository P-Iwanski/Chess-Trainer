package pl.coderslab.chesstrainer.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.coderslab.chesstrainer.apiClient.ChessClient;
import pl.coderslab.chesstrainer.apiClient.dTo.GamesDto;

import java.util.List;

@Service
@Slf4j
@Component
@RequiredArgsConstructor
public class ShowGames {
    private final ChessClient chessClient;


    public List<GamesDto> getManyWhiteGames(String username, String ECO, CurrentUser user) {
        return chessClient.getGamesForPlayerWhite(username, ECO, user);

    }

    public List<GamesDto> getManyBlackGames(String username, String ECO, CurrentUser user) {
        return chessClient.getGamesForPlayerBlack(username, ECO, user);

    }

}
