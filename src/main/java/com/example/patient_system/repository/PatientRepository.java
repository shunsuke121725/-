package com.example.patient_system.repository;

import com.example.patient_system.entity.Patient;
import com.example.patient_system.mapper.PatientMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientRepository {
<<<<<<< HEAD
    private final PatientMapper patientMapper;

    public PatientRepository(PatientMapper patientMapper) {
        this.patientMapper = patientMapper;
    }

    public List<Patient> getAllPatients() {
        return patientMapper.selectALLPatients();
    }
    
=======

    private final PatientMapper patientMapper;
    public PatientRepository(PatientMapper patientMapper) {
        this.patientMapper = patientMapper;
    }
    public List<Patient> findAll() {
        return patientMapper.findAll();
    }

    // 他のメソッドをあとで追加：findById, insert, update, delete など
>>>>>>> 29d701984f04c98e8b453d4ff108e996ef1af6b5
}
