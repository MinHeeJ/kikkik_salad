package com.sd.app.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sd.app.member.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@Validated
@RequestMapping("/member")
public class MemberSecurityController {
	
	@Autowired
	private MemberService memberService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping("/memberCreate.do")
	public void memberCreate() {
	}

	@GetMapping("/memberCreate2.do")
	public void memberCreate2(@RequestParam String fullEmail, Model model) {
		model.addAttribute("email", fullEmail);
	}


	@GetMapping("/memberLogin.do")
	public void memberLogin() {
		
	}

}

	

