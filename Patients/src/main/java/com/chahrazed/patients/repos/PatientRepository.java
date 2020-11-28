package com.chahrazed.patients.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chahrazed.patients.entities.Medcin;
import com.chahrazed.patients.entities.Patient;

@RepositoryRestResource(path = "rest")
public interface PatientRepository extends JpaRepository<Patient, Long> 
{
List<Patient> findByNomPatient(String nom);
 List<Patient> findByNomPatientContains(String nom);
 @Query("select p from Patient p where p.nomPatient like %?1 and p.prixConsultation > ?2")
 List<Patient> findByNomPrix (String nom, Double prix);
 @Query("select p from Patient p where p.medcin = ?1")
 List<Patient> findByMedcin (Medcin medcin);

 List<Patient> findByMedcinIdMed(Long id);
 List<Patient> findByOrderByNomPatientAsc();
 @Query("select p from Patient p order by p.nomPatient ASC, p.prixConsultation DESC")
 List<Patient> trierPatientsNomsPrix ();


}
