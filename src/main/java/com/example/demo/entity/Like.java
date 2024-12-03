package com.example.demo.entity;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Table(name="like")
@DynamicInsert
public class Like {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long likeId;
	
	@Column(nullable=false, length=50)
	private String classification;
	
	@ManyToOne
	@JoinColumn(name="member_id", nullable=false)
	private Member memberId;
	
	@ManyToOne
	@JoinColumn(name="duty_id", nullable=false)
	private Duty dutyId;
}
