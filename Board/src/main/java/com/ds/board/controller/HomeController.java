package com.ds.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ds.board.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	private final UserService adminService;

    @Autowired
    public HomeController(UserService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/")
	public String loginPage() {
		
		return "main";
	}
}
