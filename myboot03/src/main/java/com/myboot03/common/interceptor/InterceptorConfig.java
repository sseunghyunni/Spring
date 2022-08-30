package com.myboot03.common.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@Configuration
public class InterceptorConfig {
	public void addInterceptor(InterceptorRegistry registry) {
		registry.addInterceptor(new ViewNameInterceptor())
				.addPathPatterns("/*.do")
				.addPathPatterns("/*/*.do")
				.excludePathPatterns("/users/login");
	}
}
