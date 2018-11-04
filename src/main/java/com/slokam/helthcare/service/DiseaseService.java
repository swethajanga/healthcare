package com.slokam.helthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.DiseaseDao;
import com.slokam.helthcare.entity.Disease;
@Service
public class DiseaseService {

	@Autowired
	private DiseaseDao diseasedao;
	
	public void saveDisease(Disease disease){
		diseasedao.save(disease);
	}
	public void saveAllDiseases(List<Disease> diseases){
		diseasedao.saveAll(diseases);
	}
	
	
}
