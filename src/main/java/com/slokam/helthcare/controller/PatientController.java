package com.slokam.helthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.helthcare.entity.Patient;
import com.slokam.helthcare.service.PatientService;

@RestController
@RequestMapping("patient")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@GetMapping("/{id}")
	public Patient getPatient(@PathVariable Long id){
		
		return null;
	}
	@GetMapping("/all")
	public List<Patient> getAllPatients(){
		
		return null;
	}
	@PostMapping
	public void savePatient(@RequestBody Patient patient){
		patientService.savePatient(patient);
	}
	
	@PostMapping("/all")
	public void saveAllPatients(@RequestBody List<Patient> patients){
		patientService.savePatients(patients);
	}
	
	@DeleteMapping
	public void getPatient(@RequestBody Patient patient){
		patientService.savePatient(patient);
	}
	@GetMapping("/byMedicine/{name}")
	public List<Object[]>  getPatientByMedicine(@PathVariable("name") String medicineName ){
	
			return patientService.getPatientByMedicine(medicineName);
	}
	
}
