package com.jpa_demo2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa_demo2.entities.Employees;
import com.jpa_demo2.entities.Parking;

@Repository
public interface ParkingRepo  extends JpaRepository<Parking, Integer> {

}
