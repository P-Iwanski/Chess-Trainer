package pl.coderslab.chesstrainer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.chesstrainer.model.dto.GameDto;
import pl.coderslab.chesstrainer.service.CurrentUser;
import pl.coderslab.chesstrainer.service.ShowGames;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@Controller
public class WhiteGamesFormController {
    private final ShowGames showGames;

    @RequestMapping(value = "/app/whiteGameView", method = RequestMethod.GET)
    public String bgv(@AuthenticationPrincipal CurrentUser customUser) {
        return "app/whiteGameView";
    }

    @RequestMapping(value = "/app/whiteGameView", method = RequestMethod.POST)
    public String view1(@Valid @ModelAttribute GameDto gameDto, BindingResult errors,
                        @AuthenticationPrincipal CurrentUser currentUser) {
        if (!gameDto.getUsername().isEmpty()
                && !gameDto.getECO().isEmpty()
                && gameDto.getECO().length() == 3
                && gameDto.getECO().startsWith("A") || gameDto.getECO().startsWith("B") || gameDto.getECO().startsWith("C")
                || gameDto.getECO().startsWith("D") || gameDto.getECO().startsWith("E")){
            showGames.getManyWhiteGames(gameDto.getUsername(), gameDto.getECO(), currentUser);
            return "/app/whiteGameView";
        }
        return "/app/whiteGameView";
    }
}
