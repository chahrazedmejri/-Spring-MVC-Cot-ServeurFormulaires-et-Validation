package com.chahrazed.patients.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.chahrazed.patients.entities.Medcin;
import com.chahrazed.patients.entities.Patient;

public interface PatientService {
	Patient savePatient(Patient p);
	Patient updatePatient(Patient p);
	
	 void deletePatient(Patient p);
	 void deletePatientById(Long id);
	 Page<Patient> getAllPatientsParPage(int page, int size);
	 Patient getPatient(Long id);
	 List<Patient> getAllPatients();
		List<Patient> findByNomPatient(String nom);
		List<Patient> findByNomPatientContains(String nom);
		List<Patient> findByNomPrix (String nom, Double prix);
		List<Patient> findByMedcin (Medcin medcin);
		List<Patient> findByMedcinIdMed(Long id);
		List<Patient> findByOrderByNomPatientAsc();
		List<Patient> trierPatientsNomsPrix();
		
}
