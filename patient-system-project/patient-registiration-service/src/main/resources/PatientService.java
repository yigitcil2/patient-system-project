 
public class PatientService {
	package com.example.patient_service;

	import java.util.List;
	import java.util.Optional;

	import org.springframework.stereotype.Service;

	import com.example.patient_registiration.Patient;
	import com.example.patient_registiration.repository.PatientRepository;

	@Service
	public class PatientService {
		PatientRepository patientRepository;

		public PatientService(PatientRepository patietnRepository) {
			this.patientRepository = patietnRepository;
		}

		public  List<Patient> getAllPatients() {
			return patientRepository.findAll();
		}
		
		 public List<Patient> searchPatients(String Name, String Surname, String gender) {
		        return patientRepository.findByPatientInfo(Name, Surname, gender);

		public Patient saveOnePatient(Long patientId) {
			return patientRepository.findById(patientId).orElse(null);
		}

		public Patient updateOnePatient(Long patientId, Patient newPatient) {
			
			Optional<Patient> patient = patientRepository.findById(patientId);
			if(patient.isPresent()) {
				Patient foundPatient = patient.get();
				foundPatient.setName(newPatient.getName());
				foundPatient.setSurname(newPatient.getSurname());
				foundPatient.setPassword(newPatient.getPassword());
				foundPatient.setTckn(newPatient.getTckn());
				foundPatient.setGender(newPatient.getGender());
				foundPatient.setBirthday(newPatient.getBirthday());
				foundPatient.setContacts(newPatient.getContacts());
				patientRepository.save(foundPatient);
				return foundPatient;
			} else
				return null;
		}

		public void deleteById(Long patientId) {
			patientRepository.deleteById(patientId);
			
		}

		
		
	}

}
