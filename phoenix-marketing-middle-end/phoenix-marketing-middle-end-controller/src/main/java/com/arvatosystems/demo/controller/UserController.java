package com.arvatosystems.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arvatosystems.demo.service.api.IUserService;
import com.arvatosystems.demo.service.api.idto.IUser;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService userservice;
	
    @RequestMapping(value="get/{id}",method = RequestMethod.GET)
	@ResponseBody
    public Object  get(@PathVariable Long id, ModelMap model) {
        IUser user = userservice.getUser(id);
        return user;
    }

}