package com.example.learnSpringBoot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Intercepts requests/response
 * @author Karen
 *
 */
@Component
public class PersonInterceptor implements HandlerInterceptor{
	
	/**
	 * Executes before sending request to controller. Will continue with execution only if method returns true.
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("In pre handle");
		return true;
	}
	
	/**
	 * Executes before sending response to client.
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			 ModelAndView modelAndView) throws Exception {
		System.out.println("In post handle"+response.getHeader("interceptor-added"));
	}
	
	/**
	 * Executes after completion of request i.ie., after response is sent.
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
		System.out.println("In after completion");
	}
	

}
