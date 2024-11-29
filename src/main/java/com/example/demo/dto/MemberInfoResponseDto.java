package com.example.demo.dto;

import lombok.Data;

@Data
public class MemberInfoResponseDto {
	String memberId;
	String nickname;
	String email;
	String phoneNumber;
	String systemName;
	String originName;
}
