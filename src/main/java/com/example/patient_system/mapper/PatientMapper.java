package com.example.patient_system.mapper;
import com.example.patient_system.entity.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PatientMapper {

    @Select("SELECT name, age, bloodType, diseaseName, symptoms, latestBookingDate FROM patients")
    List<Patient> selectALLPatients();
    
}
