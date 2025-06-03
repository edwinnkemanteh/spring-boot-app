package com.ireachagility.userapp.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        return "Oops! The page you requested was not found.";
    }

    // Remove this method
    // @Override
    // public String getErrorPath() {
    //    return "/error";
    // }

}