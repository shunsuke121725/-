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

    public Patient findById(Integer id) {
        return patientMapper.findById(id);
    }

    public void updatePatient(Patient patient) {
        patientMapper.updatePatient(patient);
    }

    public void deletePatient(Integer id) {
        patientMapper.deletePatient(id);
    }
}
