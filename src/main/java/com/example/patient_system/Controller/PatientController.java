package com.example.patient_system.Controller;

import com.example.patient_system.entity.Lists;
import com.example.patient_system.entity.Patient;
import com.example.patient_system.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
        List<Lists> lists = patientService.getAllLists();
        
        model.addAttribute("lists", lists);
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
        //listIdを1に固定
        patient.setListId(1);
        patientService.savePatient(patient);
        return "redirect:/patients";  // 保存後に患者一覧へリダイレクト
    }
    @GetMapping("/edit/{id}")
    public String editPatient(@PathVariable("id") Integer id, Model model) {
        Patient patient = patientService.findById(id);
        model.addAttribute("patient", patient);
        return "patient-form"; // 新規登録と同じフォームを再利用
    }

    @PostMapping("/update")
    public String updatePatient(@ModelAttribute Patient patient) {
        patientService.updatePatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable("id") Integer id) {
        patientService.deletePatient(id);
        return "redirect:/patients";
    }
}