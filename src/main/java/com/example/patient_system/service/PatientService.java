package com.example.patient_system.service;

<<<<<<< HEAD
import com.example.patient_system.repository.PatientRepository;
import com.example.patient_system.entity.Patient;
=======
import com.example.patient_system.entity.Patient;
import com.example.patient_system.repository.PatientRepository;
>>>>>>> 15d0ce06a79ca662f4201f2f40f31c83fa174f6d
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
<<<<<<< HEAD
=======

>>>>>>> 15d0ce06a79ca662f4201f2f40f31c83fa174f6d
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
<<<<<<< HEAD
        return patientRepository.getAllPatients();
    }
}
=======
        return patientRepository.findAll();
    }

    // ここに必要に応じて患者の追加、更新、削除、詳細取得のメソッドを追加していく

}
>>>>>>> 15d0ce06a79ca662f4201f2f40f31c83fa174f6d
