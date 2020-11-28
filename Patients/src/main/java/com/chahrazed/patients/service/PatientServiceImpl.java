package com.chahrazed.patients.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.chahrazed.patients.entities.Medcin;
import com.chahrazed.patients.entities.Patient;
import com.chahrazed.patients.repos.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
@Autowired
PatientRepository patientRepository;
@Override
public Patient savePatient(Patient p) {
return patientRepository.save(p);
}
@Override
public Patient updatePatient(Patient p) {
return patientRepository.save(p);
}
@Override
public void deletePatient(Patient p) {
patientRepository.delete(p);
}
 @Override
public void deletePatientById(Long id) {
patientRepository.deleteById(id);
}
@Override
public Patient getPatient(Long id) {
return patientRepository.findById(id).get();
}
@Override
public Page<Patient> getAllPatientsParPage(int page, int size) {
return patientRepository.findAll(PageRequest.of(page, size));
}

@Override
public List<Patient> getAllPatients() {
return patientRepository.findAll();
}

@Override
public List<Patient> findByNomPatient(String nom) {
return patientRepository.findByNomPatient(nom);
}
@Override
public List<Patient> findByNomPatientContains(String nom) {
return patientRepository.findByNomPatientContains(nom);
}
@Override
public List<Patient> findByNomPrix(String nom, Double prix) {
	return patientRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Patient> findByMedcin(Medcin medcin) {
	return patientRepository.findByMedcin(medcin);
	}
	@Override
	public List<Patient> findByMedcinIdMed(Long id) {
	return patientRepository.findByMedcinIdMed(id);
	}
	@Override
	public List<Patient> findByOrderByNomPatientAsc() {
	return patientRepository.findByOrderByNomPatientAsc();
	}
	@Override
	public List<Patient> trierPatientsNomsPrix() {
	return patientRepository.trierPatientsNomsPrix();
	}
}