package org.spaceit.controller;

import org.spaceit.beans.Users;
import org.spaceit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gkstn_000 on 2015-11-21.
 */

@Controller
@RequestMapping("/")
public class RootController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)//first page
    String firstIndex(Model model){
        return "root/select-gender";
    }

    @RequestMapping(value = "result", method = RequestMethod.POST)
    String resultIndex(Model model, @RequestParam("time")String time){
        model.addAttribute("clicked_time",time);
        return "root/result";
    }

    @RequestMapping(value = "main", method = RequestMethod.POST)
    String genderPost(Model model, @ModelAttribute Users users){
        model.addAttribute("gender_greeting", userService.getData(users));
        return "root/index";
    }

}
