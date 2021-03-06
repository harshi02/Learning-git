package com.jpa_demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa_demo2.entities.Employees;
import com.jpa_demo2.entities.Parking;
import com.jpa_demo2.repo.EmployeeRepo;
import com.jpa_demo2.repo.ParkingRepo;

@SpringBootApplication
public class JpaDemo2Application implements CommandLineRunner{

	@Autowired
	private EmployeeRepo empRepo;
	@Autowired
	private ParkingRepo parkingRepo;
	public static void main(String[] args) {
		SpringApplication.run(JpaDemo2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Parking parking1= new Parking("A34");
		Parking parking2= new Parking("Mw4");
		Parking parking3= new Parking("H40");
		
	    Employees emp1= new Employees("sai", 5000.00, parking1);
	    Employees emp2= new Employees("Vijaya", 10000.00, parking2);
	    Employees emp3= new Employees("harshi", 7000.00, parking3);
	    
	    parking1.setEmployee(emp1);
	    parking2.setEmployee(emp2);
	    parking3.setEmployee(emp3);
		
	    empRepo.save(emp1);
	    empRepo.save(emp2);
	    empRepo.save(emp3);
	    
	    parkingRepo.save(parking1);
	    parkingRepo.save(parking2);
	    parkingRepo.save(parking3);
	    
	}

	
}
