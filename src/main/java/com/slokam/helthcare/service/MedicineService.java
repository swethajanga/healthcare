package com.slokam.helthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.MedicineDAO;
import com.slokam.helthcare.entity.Medicine;

@Service
public class MedicineService {

	@Autowired
	private MedicineDAO medicineDao;
	
	public void saveMedicine(Medicine medicine){
		medicineDao.save(medicine);
	}
	
	public void saveMedicineList(List<Medicine> medicineList){
		medicineDao.saveAll(medicineList);
	}
	
}
