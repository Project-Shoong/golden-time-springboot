package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ReviewListResponseDto;
import com.example.demo.dto.ReviewUpdateRequestDto;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Override
	public List<ReviewListResponseDto> getList(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ReviewListResponseDto> getList(String memberId, int months) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ReviewListResponseDto> getList(String memberId, String classification) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean update(ReviewUpdateRequestDto review) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(long reviewId) {
		// TODO Auto-generated method stub
		return false;
	}
}
