package com.example.patient_system.mapper;

import com.example.patient_system.entity.Patient;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface PatientMapper {

    @Select("SELECT * FROM patient")
    List<Patient> selectALLpatient();

    @Insert("INSERT INTO patient (name, latestBookingDate, plase) VALUES (#{name}, #{latestBookingDate}, #{place})")
    @Options(useGeneratedKeys = true, keyProperty = "patientId")
    void insertPatient(Patient patient);

}