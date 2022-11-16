package pl.coderslab.chesstrainer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.chesstrainer.model.User;
import pl.coderslab.chesstrainer.model.dto.RegisterDto;
import pl.coderslab.chesstrainer.service.UserService;

import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
public class HomeController {
    private final UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "home";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET) //
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute RegisterDto registerDto, BindingResult result) {
        User user = null;

        if (!result.hasErrors()) {
            user = userService.registerUser(registerDto);

            if (user != null) {
                return "redirect:login";
            }
        }
        return "register";

    }

    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public String print404() {
        return "404";
    }

    @RequestMapping(value = "/blank", method = RequestMethod.GET)
    public String blank() {
        return "blank";
    }

}