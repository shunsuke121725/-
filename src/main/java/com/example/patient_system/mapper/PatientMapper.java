package com.example.patient_system.mapper;
import com.example.patient_system.entity.Patient;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PatientMapper {
    @Insert("INSERT INTO patients (name, age, bloodType, diseaseName, symptoms, latestBookingDate) " +
        "VALUES (#{name}, #{age}, #{bloodType}, #{diseaseName}, #{symptoms}, #{latestBookingDate})")
    void insertPatient(Patient patient);

    @Select("SELECT patient_id, name, latestBookingDate, place FROM patients")
    List<Patient> selectALLPatients();
    
}
