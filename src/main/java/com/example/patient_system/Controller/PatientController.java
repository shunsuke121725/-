package com.example.patient_system.Controller;

import com.example.patient_system.entity.Patient;
import com.example.patient_system.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



@Controller
@RequestMapping("/patients")


public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // 患者一覧を表示（基本画面1）
    @GetMapping("/home")
    public String showPatientList(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "home"; // resources/templates/home.html を表示
    }
    @GetMapping
    public String patient(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);

        return "patient/patient-list";
    }
}