package com.slokam.helthcare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.helthcare.entity.Patient;

@Repository
public interface PatientDAO extends JpaRepository<Patient, Long>{

	@Query(" select di.name ,d.name , p.name from Medication m join m.medicne me"
			+ " join m.complaint c "
			+ " join c.visiting v "
			+ " join v.appointment a"
			+ " join a.patient p"
			+ " join v.doctor d"
			+ " join c.disease di"
			+ " where me.name =?1")
	public List<Object[]>  getPatientByMedicine(String medicineName );
	
}
