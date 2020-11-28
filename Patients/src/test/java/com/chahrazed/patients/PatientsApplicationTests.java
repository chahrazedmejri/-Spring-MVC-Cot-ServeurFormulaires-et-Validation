package com.chahrazed.patients;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chahrazed.patients.entities.Medcin;
import com.chahrazed.patients.entities.Patient;
import com.chahrazed.patients.repos.PatientRepository;

@SpringBootTest
class PatientsApplicationTests {
@Autowired
private PatientRepository patientRepository;
@Autowired
@Test
public void testCreatePatient() {
Patient pat = new Patient("Med hakim khmiri",65.500,new Date());
patientRepository.save(pat);
}

@Test
public void testUpdatePatient()
{
Patient p = patientRepository.findById(1L).get();
p.setPrixConsultation(100.0);
patientRepository.save(p);
}
@Test
public void testDeletePatient()
{
patientRepository.deleteById(1L);;
}

@Test
public void testListerTousPatients()
{
List<Patient> pats = patientRepository.findAll();
for (Patient p : pats)
{
System.out.println(p);
}
}



@Test
public void testFindByNomPatient()
{
List<Patient> pat = patientRepository.findByNomPatient("lilya");
for (Patient p : pat)
{
System.out.println(p);
}
}

@Test
public void testFindByNomPatientContains()
{
List<Patient> pat=patientRepository.findByNomPatientContains("Med Hakim");
for (Patient p : pat)
{
System.out.println(p);
} 
}

@Test
public void testfindByNomPrix()
{
List<Patient> pat = patientRepository.findByNomPrix("dhouha hamdi", 53.0);
for (Patient p : pat)
{
System.out.println(p);
}
}

@Test
public void testfindByMedcin()
{
Medcin Med = new Medcin();
Med.setIdMed(1L);
List<Patient> pat = patientRepository.findByMedcin(Med);
for (Patient p : pat)
{
System.out.println(p);
}
}

@Test
public void findByMedcinIdMed()
{
List<Patient> pat = patientRepository.findByMedcinIdMed(1L);
for (Patient p : pat)
{
System.out.println(p);
}
 }
@Test
public void testfindByOrderByNomPatientAsc()
{
List<Patient> pat =
patientRepository.findByOrderByNomPatientAsc();
for (Patient p : pat)
{
System.out.println(p);
}
}

@Test
public void testTrierPatientsNomsPrix()
{
List<Patient> pat = patientRepository.trierPatientsNomsPrix();
for (Patient p : pat)
{
System.out.println(p);
}
}


}

