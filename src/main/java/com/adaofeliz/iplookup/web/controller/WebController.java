package com.adaofeliz.iplookup.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created on 14/12/14.
 */

@Controller
public class WebController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.TEMPORARY_REDIRECT)
    public void baseUrl(HttpServletResponse httpServletResponse)
            throws IOException {

        // Just Redirecting to the Web Interface
        httpServletResponse.sendRedirect("index.html");
    }
}
