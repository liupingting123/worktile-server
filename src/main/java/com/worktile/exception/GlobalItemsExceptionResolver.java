package com.worktile.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GlobalItemsExceptionResolver implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request,
										 HttpServletResponse response,
										 Object handler, Exception ex) {

		String message;
		// 如果是自定义异常，给出具体的异常信息
		if (ex instanceof ItemsException) {
			message = ex.getMessage();
		} else {
			message = "服务器未知错误";
		}

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("error_message", message);
		modelAndView.setViewName("items/error");
		return modelAndView;
	}
}
