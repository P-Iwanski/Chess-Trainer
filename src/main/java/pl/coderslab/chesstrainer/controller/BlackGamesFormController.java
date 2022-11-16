package pl.coderslab.chesstrainer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.chesstrainer.service.CurrentUser;
import pl.coderslab.chesstrainer.service.ShowGames;

@Slf4j
@RequiredArgsConstructor
@Controller
public class BlackGamesFormController {
    private final ShowGames showGames;

    @RequestMapping(value = "/app/blackGameView", method = RequestMethod.GET)
    public String bgv(@AuthenticationPrincipal CurrentUser customUser){
        return "app/blackGameView";
    }
    @RequestMapping(value = "/app/blackGameView", method = RequestMethod.POST)
    public String view1(@RequestParam String username, @RequestParam String ECO, @AuthenticationPrincipal CurrentUser currentUser){
        if (!username.isEmpty()
                && !ECO.isEmpty()
                && ECO.length() == 3
                && ECO.startsWith("A") || ECO.startsWith("B") || ECO.startsWith("C")
                || ECO.startsWith("D") || ECO.startsWith("E")){
            showGames.getManyBlackGames(username, ECO, currentUser);;
            return "/app/blackGameView";
        }
        return "/app/blackGameView";

    }

}
