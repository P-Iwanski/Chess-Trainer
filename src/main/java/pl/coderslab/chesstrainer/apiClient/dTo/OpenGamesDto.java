package pl.coderslab.chesstrainer.apiClient.dTo;

import lombok.Getter;

@Getter
public class OpenGamesDto {
    private String speed;
    private String status;
    private OpeningDto opening;
    private PlayersDto players;

}
