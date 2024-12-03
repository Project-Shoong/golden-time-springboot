package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Duty;
import com.example.demo.entity.Like;
import com.example.demo.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{
	List<Review> findAllByMember_MemberId(String memberId);
	List<Review> findAllByMember_MemberIdAndUpdatedAtGreaterThanEqual
	
}
