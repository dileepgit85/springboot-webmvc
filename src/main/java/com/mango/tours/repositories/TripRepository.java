package com.mango.tours.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mango.tours.entities.Trip;

public interface TripRepository extends JpaRepository<Trip, Integer>{

}
