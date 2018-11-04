package com.slokam.helthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.helthcare.entity.Doctor;
import com.slokam.helthcare.service.DoctorService;
@RestController
@RequestMapping("doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping
	public void saveDoctor(@RequestBody Doctor doctor){
		doctorService.saveDoctor(doctor);
	}
	
	@PostMapping("/all")
	public void saveAllDoctors(List<Doctor> doctors){
		doctorService.saveAllDoctors(doctors);
	}
}
