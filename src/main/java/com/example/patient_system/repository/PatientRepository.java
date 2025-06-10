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
    public List<Patient> findAll() {
        return patientMapper.findAll();
    }

    // 他のメソッドをあとで追加：findById, insert, update, delete など
}