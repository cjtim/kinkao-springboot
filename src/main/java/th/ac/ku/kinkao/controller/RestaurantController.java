package th.ac.ku.kinkao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.kinkao.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {
    private List<Restaurant> restaurantList = new ArrayList<>();

    @GetMapping
    public String getRestaurants(Model model) {
        model.addAttribute("restaurants", restaurantList);
        return "restaurants";
    }

    @GetMapping("/add")
    public String getAddPage(Model model) {
        return "restaurant-add";
    }

    @PostMapping("/add")
    public String addRestaurant(@ModelAttribute Restaurant restaurant) {
        restaurantList.add(restaurant);
        return "redirect:/restaurant";
    }

}
