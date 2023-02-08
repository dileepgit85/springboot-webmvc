package com.mango.tours.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TripDto {
	
	private int tripNumber;
	
	private String tripName;
	
	private String source;
	
	private String destination;
	
	private LocalDate plannedDate;
	
	private int days;
	
	private double estimatedCost;

}
