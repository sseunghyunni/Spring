package com.myspring.pro30.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ViewNameInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		try {
			String viewName= getViewName(request);
			request.setAttribute("viewName", viewName);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}
	
	private String getViewName(HttpServletRequest request) throws Exception{
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if(uri==null || uri.trim().equals("")) {
			uri=request.getRequestURI();
		}
		int begin = 0;
		if(!((contextPath == null)||("".equals(contextPath)))) {
			begin = contextPath.length();
		}
		int end;
		if(uri.indexOf(";")!=-1) {
			end = uri.indexOf(";");
		}else if (uri.indexOf("?")!=-1) {
			end= uri.indexOf("?");
		}else {
			end= uri.length();
		}
		String viewName = uri.substring(begin,end);
		if(viewName.indexOf(".")!=-1) {
			viewName = viewName.substring(0,viewName.lastIndexOf("."));
		}
		if(viewName.lastIndexOf("/")!=-1) {
			viewName = viewName.substring(viewName.lastIndexOf("/",1),viewName.length());
		}
		return viewName;
	}

}
