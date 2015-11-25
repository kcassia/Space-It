package org.spaceit.controller;

import org.spaceit.beans.User;
import org.spaceit.beans.UserRepository;
import org.spaceit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by gkstn_000 on 2015-11-21.
 */

@Controller
@RequestMapping("/")
public class RootController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)//first page
    String firstIndex(Model model, HttpServletRequest req){

        model.addAttribute("addr",req.getRemoteAddr());

        return "root/select-gender";
    }

    @RequestMapping(value = "main", method = RequestMethod.POST)
    String genderPost(Model model, @ModelAttribute User user){

        model.addAttribute("gender_greeting", userService.getData(user));
        userRepository.appendUsers(user);
        model.addAttribute("index", (userRepository.getLength()-1));

        return "root/index";
    }

    @RequestMapping(value = "result-wait", method = RequestMethod.POST)
    String resultIndex(Model model, @RequestParam("time")String time, @RequestParam("index")String index){

        userRepository.getUsersAt(Integer.parseInt(index)).setTime(time);
        model.addAttribute("clicked_time",time);
        model.addAttribute("index",index);

        return "root/result-wait";
    }

    @RequestMapping(value = "result", method = RequestMethod.POST)
    String resultIndex(Model model, @RequestParam("index")String index){

        model.addAttribute("result",userService.FindSyncbyIndex(userRepository,Integer.parseInt(index)));

        return "root/result";
    }
}
