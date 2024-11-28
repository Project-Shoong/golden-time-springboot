package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.global.ApiResponse;
import com.example.demo.global.ResponseCode;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/*")
public class LikeController {

	@GetMapping("likes")
	public ApiResponse<LikeListResponseDto> list(HttpServletRequest req) {
		String loginMember = (String)req.getSession().getAttribute("loginMember");
		LikeListResponseDto list = service.getList(loginMember);
		if(list!=null) return ApiResponse.success(list, ResponseCode.LIKES_GET_SUCCESS);
		return ApiResponse.fail(list, ResponseCode.LIKES_NOT_FOUND);
	}

}
