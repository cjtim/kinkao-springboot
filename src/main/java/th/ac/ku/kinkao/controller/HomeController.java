package th.ac.ku.kinkao.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import th.ac.ku.kinkao.model.Restaurant;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHomePage(Model model, @AuthenticationPrincipal OAuth2User principal) {
        boolean isLoggedIn = principal != null;

        model.addAttribute("greeting", "Sawaddee");
        model.addAttribute("user", isLoggedIn ? principal.getAttribute("email") : "Guest");

        return "home";
    }
}
