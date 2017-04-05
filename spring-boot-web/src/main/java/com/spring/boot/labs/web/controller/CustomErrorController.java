package com.spring.boot.labs.web.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mgil on 4/1/17.
 */
//@Controller
public class CustomErrorController { //implements ErrorController {


    private final String ERROR_PATH="/error";
    private final String CUSTOM_TEMPLATE= "custom_error";


    @RequestMapping(ERROR_PATH)
    public String error(){
        return CUSTOM_TEMPLATE;
    }

    public String getErrorPath() {
        return CUSTOM_TEMPLATE;
    }
}
