package com.example.patient_system.service;

<<<<<<< HEAD
import com.example.patient_system.repository.PatientRepository;
import com.example.patient_system.entity.Patient;
=======
import com.example.patient_system.entity.Patient;
import com.example.patient_system.repository.PatientRepository;
>>>>>>> 29d701984f04c98e8b453d4ff108e996ef1af6b5
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
<<<<<<< HEAD
        return patientRepository.getAllPatients();
    }
=======
        return patientRepository.findAll();
    }

    // ここに必要に応じて患者の追加、更新、削除、詳細取得のメソッドを追加していく

>>>>>>> 29d701984f04c98e8b453d4ff108e996ef1af6b5
}
