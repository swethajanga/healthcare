package com.slokam.helthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.PatientDAO;
import com.slokam.helthcare.entity.Patient;

@Service
public class PatientService {

	@Autowired
	private PatientDAO patientDAO;
	
	public void savePatient(Patient patient){
		patientDAO.save(patient);
	}
	
	public void savePatients(List<Patient> patients){
		patientDAO.saveAll(patients);
	}
	
	public List<Object[]>  getPatientByMedicine(String medicineName ){
		return patientDAO.getPatientByMedicine(medicineName);
	}
	
	
}



