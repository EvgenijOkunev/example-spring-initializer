package com.geekhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex() {
        return "home";
    }
}
