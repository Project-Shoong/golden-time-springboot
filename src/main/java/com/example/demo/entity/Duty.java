package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Table(name="duty")
public class Duty {
	
	@Id
	@Column(nullable=false, length=50)
	private String dutyId;
	
	@Column(nullable=false, length=100)
	private String dutyName;
	
	@Column(nullable=false, length=50)
	private String dutyDiv;
	
	@Column(nullable=false, length=50)
	private String dutyTel;
}
