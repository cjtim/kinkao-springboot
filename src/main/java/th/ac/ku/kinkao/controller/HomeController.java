package th.ac.ku.kinkao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import th.ac.ku.kinkao.model.Restaurant;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHomePage(Model model){
        model.addAttribute("greeting", "Sawaddee");
        return "home";
    }
}
