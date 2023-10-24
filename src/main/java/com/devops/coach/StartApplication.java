package com.devops.coach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Hello Everyone, Happy Dussehra");
        model.addAttribute("msg", "On the auspicious occasion of Dussehra, may the divine blessings of Lord Rama bring light, joy, and victory into your life. Let the triumph of good over evil inspire you to conquer your own inner demons and obstacles. Wishing you a Happy Dussehra filled with love, happiness, and success");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
