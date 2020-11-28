package com.chahrazed.patients.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Medcin {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idMed;
private String nomMed;
private String descriptionMed;
@JsonIgnore
@OneToMany(mappedBy = "medcin")
private List<Patient> patients;

}
