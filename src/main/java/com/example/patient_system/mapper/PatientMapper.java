package com.example.patient_system.mapper;
import com.example.patient_system.entity.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PatientMapper {
<<<<<<< HEAD

    @Select("SELECT name, age, bloodType, diseaseName, symptoms, latestBookingDate FROM patients")
    List<Patient> selectALLPatients();
    
=======
   // 全患者の一覧を取得
    @Select("SELECT * FROM patients")
    List<Patient> findAll();
    // patientIdで患者を取得
    @Select("SELECT * FROM patients WHERE patient_id = #{patientId}")
    Patient findById(Integer patientId);
>>>>>>> 29d701984f04c98e8b453d4ff108e996ef1af6b5
}
