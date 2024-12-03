package com.example.demo.dto;

import java.time.LocalDateTime;

import com.example.demo.entity.Duty;
import com.example.demo.entity.Like;
import com.example.demo.entity.Member;
import com.example.demo.entity.Review;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReviewUpdateRequestDto {
	long reviewId;
	String content;
	int rating;
	String memberId;
	
	public static ReviewUpdateRequestDto toDto(Review review) {
		return ReviewUpdateRequestDto.builder()
				.reviewId(review.getReviewId())
				.content(review.getContent())
				.rating(review.getRating())
				.memberId(review.getMember().getMemberId())
				.build();
	}
}