package com.slokam.helthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.AppointmentDAO;
import com.slokam.helthcare.entity.Appointment;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentDAO appointmentDao;
	
	public void saveAppointment(Appointment appointment){
		appointmentDao.save(appointment);
	}
	
}
