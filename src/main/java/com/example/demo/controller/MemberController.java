package com.example.demo.controller;

import java.net.http.HttpRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/member/*")
public class MemberController {
	
	
	@GetMapping("session")
	public ResponseEntity<String> get(HttpServletRequest req) {
		String memberId = (String)req.getSession().getAttribute("loginMember");
		if(memberId!=null) {
			return new ResponseEntity<String>(memberId, HttpStatus.OK);			
		}
		return new ResponseEntity<String>(memberId, HttpStatus.OK);			
	}
	@GetMapping("{memberId}")
	public ResponseEntity<MemberDTO> get(@PathVariable String memberId){
		return new ResponseEntity<MemberDTO>(service.get(memberId), HttpStatus.OK);
	}
	@PutMapping("{memberId}")
	public ResponseEntity<String> modify(MemberDTO member, HttpServletRequest req){
		HttpSession session = req.getSession();
		String loginUser = (String)session.getAttribute("loginUser");
		return new ResponseEntity<MemberDTO>(service.modify(member), HttpStatus.OK);
	}
	@DeleteMapping("{memberId}")
	public ResponseEntity<MemberDTO> delete(@PathVariable String memberId){
		return new ResponseEntity<MemberDTO>(service.get(memberId), HttpStatus.OK);
	}

}
