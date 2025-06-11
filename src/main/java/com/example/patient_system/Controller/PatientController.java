package com.example.patient_system.Controller;

import com.example.patient_system.entity.Patient;
import com.example.patient_system.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // 患者一覧（URL: /patients または /patients/home）
    @GetMapping("/home")
    public String showPatientList(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "home"; // resources/templates/home.html を表示
    }

    @GetMapping
    public String patientList(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patient-list"; // templates/patient-list.html を返す
    }

    // 新規登録フォーム表示（URL: /patients/new）
    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "patient-form"; // templates/patient-form.html を返す
    }

    // フォーム送信を受けて保存（URL: /patients/save）
    @PostMapping("/save")
    public String save(@ModelAttribute Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/patients";  // 保存後に患者一覧へリダイレクト
    }
}