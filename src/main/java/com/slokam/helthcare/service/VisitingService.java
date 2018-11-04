package com.slokam.helthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.VisitingDAO;
import com.slokam.helthcare.entity.Visiting;

@Service
public class VisitingService {

	@Autowired
	private VisitingDAO visitingDao;
	
	
	public void saveVisiting(Visiting visiting){
		visitingDao.save(visiting);
	}
	
}
