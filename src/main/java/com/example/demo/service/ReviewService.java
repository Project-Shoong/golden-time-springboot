package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.PharmListDTO;
import com.example.demo.domain.PharmReviewDTO;
import com.example.demo.domain.ReviewWriteDTO;
import com.example.demo.dto.ReviewItemDto;
import com.example.demo.dto.ReviewListResponseDto;
import com.example.demo.dto.ReviewUpdateRequestDto;


public interface ReviewService {

	List<PharmListDTO> getPharmreviewcount(List<String> hpid);

	List<PharmReviewDTO> getPharmReview(String hpid);

	void writeReview(ReviewWriteDTO rv);

	List<ReviewItemDto> getList(String memberId);
	List<ReviewItemDto> getList(String memberId, int month);
	List<ReviewItemDto> getList(String memberId, String classification);
	List<ReviewItemDto> getList(String memberId, int month, String classification);
	ReviewListResponseDto getList(String memberId, int pageNo, int numOfRows);
	ReviewListResponseDto getList(String memberId, int month, int pageNo, int numOfRows);
	ReviewListResponseDto getList(String memberId, String classification, int pageNo, int numOfRows);
	ReviewListResponseDto getList(String memberId, int month, String classification, int pageNo, int numOfRows);
	boolean update(ReviewUpdateRequestDto review);
	boolean delete(long reviewId);
}
