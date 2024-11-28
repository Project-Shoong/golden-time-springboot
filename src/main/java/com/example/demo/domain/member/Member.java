package com.example.demo.domain.member;

import lombok.Data;

@Data
public class Member {
	private String memberId;
	private String password;
	private String nickname;
	private String email;
	private String phoneNumber;
	private String systemName;
	private String originName;
}
