package com.shoron.controller;

import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value="/springversion")
	@ResponseBody
	public String index(){
		return "Spring version: " + SpringVersion.getVersion()+" ";
	}
	
	@RequestMapping(value="/")
	public String hello(){
		return "helloworld";
	}
	
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value="name", required=false, defaultValue="New World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
