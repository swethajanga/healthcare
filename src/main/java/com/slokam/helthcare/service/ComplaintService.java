package com.slokam.helthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.ComplaintDao;
import com.slokam.helthcare.entity.Complaint;
import com.slokam.helthcare.entity.Medication;

@Service
public class ComplaintService {

	@Autowired
	private ComplaintDao complaintDao;
	
	public void saveComplaint(Complaint complaint){
		List<Medication> medicationList = complaint.getMedicationList();
		
		for (Medication medication : medicationList) {
			medication.setComplaint(complaint);
		}
		
		
		complaintDao.save(complaint);
	}
	
	
}
