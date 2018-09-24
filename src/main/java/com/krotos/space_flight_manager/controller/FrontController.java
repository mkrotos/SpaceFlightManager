package com.krotos.space_flight_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {

    @RequestMapping("/")
    public ModelAndView showIndex(ModelAndView model){
        model.setViewName("index");
        return model;
    }

    @RequestMapping("touristPage/")
    public ModelAndView showTouristPage(ModelAndView model){
        model.setViewName("touristsPage");
        return model;
    }


}
