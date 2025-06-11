package com.example.patient_system.mapper;
import com.example.patient_system.entity.Patient;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PatientMapper {
    @Insert("INSERT INTO patients (list_id, name, age, bloodType, diseaseName, symptoms, latestBookingDate, place) " +
        "VALUES (1, #{name}, #{age}, #{bloodType}, #{diseaseName}, #{symptoms}, #{latestBookingDate}, #{place})")
    void insertPatient(Patient patient);

    @Select("SELECT patient_id, name, latestBookingDate, place FROM patients")
    List<Patient> selectALLPatients();
    
}
