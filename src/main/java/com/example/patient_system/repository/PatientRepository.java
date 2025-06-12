package com.example.patient_system.repository;

import com.example.patient_system.entity.Lists;
import com.example.patient_system.entity.Patient;
import com.example.patient_system.mapper.ListsMapper;
import com.example.patient_system.mapper.PatientMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientRepository {
    private final PatientMapper patientMapper;
    private final ListsMapper listsMapper;
    
    public PatientRepository(PatientMapper patientMapper,ListsMapper listsMapper) {
        this.patientMapper = patientMapper;
        this.listsMapper = listsMapper;
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
    public List<Lists> getAllLists() {
        return listsMapper.selectAllLists();
    }
}
