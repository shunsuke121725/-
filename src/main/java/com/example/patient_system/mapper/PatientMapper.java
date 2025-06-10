package com.example.patient_system.mapper;
import com.example.patient_system.entity.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PatientMapper {
<<<<<<< HEAD

    @Select("SELECT * FROM patients")
    List<Patient> selectALLPatients();
    
=======
   // 全患者の一覧を取得
    @Select("SELECT * FROM patients")
    List<Patient> findAll();
    // patientIdで患者を取得
    @Select("SELECT * FROM patients WHERE patient_id = #{patientId}")
    Patient findById(Integer patientId);
>>>>>>> 15d0ce06a79ca662f4201f2f40f31c83fa174f6d
}
