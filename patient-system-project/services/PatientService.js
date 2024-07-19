import axios from 'axios';

const PATIENT_REST_API = 'http://localhost:3000/api/patients';

class PatientService {
    getPatient(){
        axios.get(PATIENT_REST_API);
    }
}

export default new PatientService();