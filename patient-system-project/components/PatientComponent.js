import React, { useState, useEffect } from 'react';


const PatientComponent = () => {
    const [patients, setPatients] = useState([]);

   /* useEffect(() => {
        fetchPatients().then(response => setPatients(response.data));
    }, []);*/
    

    return (
        <div>
            <h2>Patient List</h2>
            <ul>
                {patients.map(patient => (
                    <li key={patient.id}>{patient.name} {patient.surname}</li>
                ))}
            </ul>
        </div>
    );
};

export default PatientComponent;
