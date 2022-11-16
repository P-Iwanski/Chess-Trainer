package pl.coderslab.chesstrainer.apiClient.dTo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GamesDto {
    private String eco;
    private String opening;
    private int ratingDiff;
}
