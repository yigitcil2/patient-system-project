package com.example.patient_registiration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.patient_registiration.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> { 

	  List<Patient> findByPatientInfo(String Name, String Surname, String gender);
}
