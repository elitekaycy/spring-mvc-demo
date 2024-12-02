package com.pojo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HomeController {

  @GetMapping
  public String home(Model model) {
    model.addAttribute("username", "dickson anyaele");
    return "index";
  }

  @GetMapping("/intercept")
  public String home(Model model, HttpServletRequest request) {
    Long requestStartedAt = (Long) request.getAttribute("requestStartedAt");
    Long requestEndedAt = (Long) request.getAttribute("requestEndedAt");
    String done = (String) request.getAttribute("done");

    model.addAttribute("requestStartedAt", requestStartedAt);
    model.addAttribute("requestEndedAt", requestEndedAt);
    model.addAttribute("done", done);
    return "intercept";
  }
}
