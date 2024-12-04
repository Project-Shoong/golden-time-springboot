package com.example.demo.dto;

import com.example.demo.entity.Duty;
import com.example.demo.entity.Like;
import com.example.demo.entity.Member;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LikeListResponseDto {
	long likeId;
	String classification;
	String memberId;
	String nickname;
	Duty duty;
	
	public static LikeListResponseDto toDto(Like like) {
		return LikeListResponseDto.builder()
				.likeId(like.getLikeId())
				.classification(like.getClassification())
				.memberId(like.getMember().getMemberId())
				.nickname(like.getMember().getNickname())
				.duty(like.getDuty())
				.build();
	}
}