package com.mango.tours.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="trip")
@Data
public class Trip {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="trip_no")
	private int tripNumber;
	
	@Column(name="trip_nm")
	private String tripName;
	
	private String source;
	
	private String destination;
	
	@Column(name="planned_dt")
	private LocalDate plannedDate;
	
	private int days;
	
	@Column(name="estimated_cost")
	private double estimatedCost;

	
}
