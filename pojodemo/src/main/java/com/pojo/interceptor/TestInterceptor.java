package com.pojo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TestInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
    long requestStartedAt = System.currentTimeMillis();
    request.setAttribute("requestStartedAt", requestStartedAt);
    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      org.springframework.web.servlet.ModelAndView modelAndView) {
    long requestEndedAt = System.currentTimeMillis();
    request.setAttribute("requestEndedAt", requestEndedAt);
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
    request.setAttribute("done", "true");
  }
}
