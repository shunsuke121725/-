package com.example.patient_system.service;

import com.example.patient_system.entity.Patient;
import com.example.patient_system.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // ここに必要に応じて患者の追加、更新、削除、詳細取得のメソッドを追加していく

}