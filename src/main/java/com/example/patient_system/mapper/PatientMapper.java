package com.example.patient_system.mapper;
import com.example.patient_system.entity.Patient;

import org.apache.ibatis.annotations.Delete;
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
    
    @Select("SELECT * FROM patients WHERE list_id = #{listId}")
    Patient selectPatientById(long listId);

    @Delete("DELETE FROM patients WHERE patient_id = #{patientId}")
    void deletePatientById(long patientId);
}
