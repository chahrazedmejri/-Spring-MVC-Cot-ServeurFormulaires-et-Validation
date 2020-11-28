package com.chahrazed.patients.entities;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPatient;
	
	@NotNull
	@Size (min = 4,max = 15)
	
	private String nomPatient;
	@Min(value = 10)
	 @Max(value = 10000)

	private Double prixConsultation;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateConsultation;
	@ManyToOne
	private Medcin medcin;
	
	public Patient() {
	super();
	}
	public Patient(String nomPatient, Double prixConsultation, Date dateConsultation) {
	super();
	this.nomPatient = nomPatient;
	this.prixConsultation = prixConsultation;
	this.dateConsultation = dateConsultation;
	}
	public Long getIdPatient() {
	return idPatient;
	}
	public void setIdPatient(Long idPatient) {
	this.idPatient = idPatient;
	}
	public String getNomPatient() {
	return nomPatient;
	}
	public void setNomPatient(String nomPatient) {
	this.nomPatient = nomPatient;
	}
	public Double getPrixConsultation() {
	return prixConsultation;
	}
	public void setPrixConsultation(Double prixConsultation) {
	this.prixConsultation = prixConsultation;
	}
	public Date getDateConsultation() {
	return dateConsultation;
	}
	public void setDateConsultation(Date dateConsultation) {
	this.dateConsultation = dateConsultation;
	}
	@Override
	public String toString() {
	return "Patient [idPatient=" + idPatient + ", nomPatient=" +
	nomPatient + ", prixConsultation=" + prixConsultation
	+ ", dateConsultation=" + dateConsultation + "]";
	}
	}

