package com.example.patient_system.service;

import com.example.patient_system.repository.PatientRepository;
import com.example.patient_system.entity.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.getAllPatients();
    }
}
