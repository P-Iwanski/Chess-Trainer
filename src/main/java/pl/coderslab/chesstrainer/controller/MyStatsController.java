package pl.coderslab.chesstrainer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.chesstrainer.service.BlackGameService;
import pl.coderslab.chesstrainer.service.CurrentUser;
import pl.coderslab.chesstrainer.service.WhiteGameService;

@Slf4j
@RequiredArgsConstructor
@Controller
public class MyStatsController {
    private final BlackGameService blackGameService;
    private final WhiteGameService whiteGameService;

    @RequestMapping(value = "/app/myStats", method = RequestMethod.GET)
    public String stats(@AuthenticationPrincipal CurrentUser currentUser, Model model) {
        model.addAttribute("black_eco_stats", blackGameService.findAllByUser(currentUser.getUser()));
        model.addAttribute("white_eco_stats", whiteGameService.findAllByUser(currentUser.getUser()));
        return "/app/myStats";
    }
}
