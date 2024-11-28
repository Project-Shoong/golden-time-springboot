package com.example.demo.domain.like;

import lombok.Data;

@Data
public class Like {
	long likeId;
	String classification;
	String memberId;
	String dutyId; 
}
