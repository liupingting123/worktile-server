package com.worktile.controller;

import com.worktile.dao.User;
import com.worktile.service.UserService;
import com.worktile.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Snowin on 2016/11/2 0002.
 */


@CrossOrigin
@Controller
public class InitController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/init", method = RequestMethod.POST)
    @ResponseBody
    public String InitInfo(@ModelAttribute("user") User user) {
        //userService

        return "ss";
    }
}
