package com.example.demo.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Table(name="review")
@DynamicInsert
public class Review {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long reviewId;
	
	@Lob
	@Column(nullable=false, length=1000)
	private String content;
	
	@
	private String createdAt;
	private String dateTime;
	private int rating;
	private String classification;
	private String memberId;
	private String dutyId;
}
