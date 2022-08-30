package com.proTest.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.proTest.member.service.TestService;
import com.proTest.member.vo.TestVO;

@Controller("testController")
public class TestControllerImpl implements TestController {
	@Autowired
	private TestVO testVO;
	@Autowired
	private TestService testService;
	
	@Override
	@RequestMapping(value="/test9.do", method= {RequestMethod.POST})
	public ModelAndView listMembers(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		String viewName = "listMembers";
		List membersList = testService.listTests();
		ModelAndView mav= new ModelAndView(viewName);
		mav.addObject("membersList",membersList);
		return mav;
		}
	
	@RequestMapping(value="/testform.do", method= {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView testform(HttpServletRequest request, 
			HttpServletResponse response) throws Exception{

		ModelAndView mav2 = new ModelAndView("testform");
		return mav2;
	}
}
	
