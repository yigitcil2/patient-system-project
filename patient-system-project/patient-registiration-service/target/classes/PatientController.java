package com.example.patient_registiration.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.patient_registiration.Patient;
import com.example.patient_registiration.repository.PatientRepository;
import com.example.patient_service.PatientService;

@RestController  //RESTful web servisleri için
@RequestMapping("/patients")
public class PatientController {
	private PatientService patientService;
	
	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}

	@GetMapping
	public List<Patient> getAllPatients()	//hazır JDA metodu
	{ 
		return PatientService.getAllPatients();
	}
		
	@PostMapping
	public Patient createPatient(@RequestBody Patient newPatient)  //RequestBody bilgilerini Patient newPatient objesine mapping
	{
		return patientService.saveOnePatient(newPatient);
	}
	
	@GetMapping ("/{patientID)")
	public Patient getOnePatient(@PathVariable Long patientId)
	{
		return patientService.saveOnePatient(patientId);
	}
	
	@PutMapping("/{patientID") 	//var olan ID'li bir patient'i değiştirme	
	public Patient updateOnePatient(@PathVariable Long patientId, @RequestBody Patient newPatient) {
		return patientService.updateOnePatient(patientId, newPatient);
		
	}
	
	@DeleteMapping("/{patientID}") 
	public void deleteOnePatient(@PathVariable Long patientId) {
		patientService.deleteById(patientId);
	}
	
}
""