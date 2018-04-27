package com.aggregate.swagger.swaggeraggregator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SwaggerController {

    @GetMapping(path = "/swagger")
    public String redirectToSwagger() {
        return "redirect:/swagger-ui.html";
    }

}
