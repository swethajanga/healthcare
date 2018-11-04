package com.slokam.helthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.helthcare.entity.Disease;
import com.slokam.helthcare.service.DiseaseService;

@RestController
@RequestMapping("disease")
public class DiseaseController {

	@Autowired
	private DiseaseService diseaseService;
	
	@PostMapping()
	public void  saveDisease(@RequestBody Disease disease){
		diseaseService.saveDisease(disease);
		
	}
	@PostMapping("/all")
	public void  saveAllDiseases(@RequestBody List<Disease> diseases){
		diseaseService.saveAllDiseases(diseases);
	}
}
