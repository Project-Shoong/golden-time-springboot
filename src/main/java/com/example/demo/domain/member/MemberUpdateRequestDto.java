package com.example.demo.domain.member;

import lombok.Data;

@Data
public class MemberUpdateRequestDto {
	private String memberId;
	private String password;
	private String nickname;
	private String email;
	private String phoneNumber;
}
