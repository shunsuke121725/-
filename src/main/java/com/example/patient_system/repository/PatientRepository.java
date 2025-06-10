package com.example.patient_system.repository;

import com.example.patient_system.mapper.PatientMapper;
import com.example.patient_system.entity.Patient;
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
    
}
