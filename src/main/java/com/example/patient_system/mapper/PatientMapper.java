package com.example.patient_system.mapper;
import com.example.patient_system.entity.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PatientMapper {
   // 全患者の一覧を取得
    @Select("SELECT * FROM patients")
    List<Patient> findAll();
    // patientIdで患者を取得
    @Select("SELECT * FROM patients WHERE patient_id = #{patientId}")
    Patient findById(Integer patientId);
}
