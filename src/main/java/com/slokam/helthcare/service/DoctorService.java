package com.slokam.helthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.DoctorDAO;
import com.slokam.helthcare.entity.Doctor;

@Service
public class DoctorService {

	@Autowired
	private DoctorDAO doctorDao;
	
	public void saveDoctor(Doctor doctor){
		doctorDao.save(doctor);
	}
	
	public void saveAllDoctors(List<Doctor> doctors){
		doctorDao.saveAll(doctors);
	}
	
	
	
	
	
}
