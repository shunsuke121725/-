package com.example.patient_system.repository;

import com.example.patient_system.entity.Patient;
import com.example.patient_system.mapper.PatientMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientRepository {
    private final PatientMapper patientMapper;

    public PatientRepository(PatientMapper patientMapper) {
        this.patientMapper = patientMapper;
    }

    public List<Patient> getAllPatients() {
        return patientMapper.selectALLPatients();
    }
    
    public void savePatient(Patient patient) {
    patientMapper.insertPatient(patient);
}

public Patient getPatientById(long listId) {
    return patientMapper.selectPatientById(listId);
}

    public void deletePatient(long patientId) {
        patientMapper.deletePatientById(patientId);
    }
}
