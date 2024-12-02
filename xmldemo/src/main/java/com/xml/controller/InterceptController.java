package com.xml.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class InterceptController implements Controller { 

  @Override
  public ModelAndView handleRequest(HttpServletRequest request, 
                                      HttpServletResponse response) throws Exception {

        Long requestStartedAt = (Long) request.getAttribute("requestStartedAt");
        Long requestEndedAt = (Long) request.getAttribute("requestEndedAt");
        String done =(String) request.getAttribute("done");
        ModelAndView modelAndView = new ModelAndView("intercept");

        modelAndView.addObject("requestStartedAt", requestStartedAt);
        modelAndView.addObject("requestEndedAt", requestEndedAt);
        modelAndView.addObject("done", done);
        return modelAndView;
    }
}

