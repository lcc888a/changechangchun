package com.example.demo.controller;


import java.util.HashMap;
import java.util.Map;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.Banner.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;

@Controller
public class websocketController {
	
	 @Resource
	  private IUserService iUserService;
	
	 @RequestMapping("/login")
	    public String webSocket(){
	        try{
	            System.out.println("5656");
	         
	            return "login";
	        }
	        catch (Exception e){
	          
	            return "error";
	        }

	 }
	 
	 @RequestMapping("/index")
	    public String index(HttpServletRequest request, HttpServletResponse response,Model mode){
	       System.out.println("++++++"); 
      User user=iUserService.selectUser(request, response);
       
      if(user!=null) {
    	  mode.addAttribute("username", user.getU_LoginID());
    	
    	  return "index";
      }else {
    	 
    	  return "login";
      }
	 }
	 
	


}
