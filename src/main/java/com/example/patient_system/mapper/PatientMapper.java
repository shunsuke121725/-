package com.example.patient_system.mapper;
import com.example.patient_system.entity.Patient;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface PatientMapper {
    @Insert("INSERT INTO patients (list_id, name, age, bloodType, diseaseName, symptoms, latestBookingDate, place) " +
        "VALUES (#{listId}, #{name}, #{age}, #{bloodType}, #{diseaseName}, #{symptoms}, #{latestBookingDate}, #{place})")
    void insertPatient(Patient patient);
    // 新しい患者情報を登録するSQLクエリ
 @Select("SELECT patient_id, list_id, name, age, bloodType, diseaseName, symptoms, latestBookingDate, place FROM patients")
    @Results({
    @Result(column = "patient_id", property = "patientId"),
    @Result(column = "list_id", property = "listId"),
    @Result(column = "name", property = "name"),
    @Result(column = "age", property = "age"),
    @Result(column = "bloodType", property = "bloodType"),
    @Result(column = "diseaseName", property = "diseaseName"),
    @Result(column = "symptoms", property = "symptoms"),
    @Result(column = "latestBookingDate", property = "latestBookingDate"),
    @Result(column = "place", property = "place")
})
List<Patient> selectALLPatients();
    // 患者情報を更新するSQLクエリ
   @Select("SELECT * FROM patients WHERE patient_id = #{patientId}")
    @Results({
    @Result(column = "patient_id", property = "patientId"),
    @Result(column = "list_id", property = "listId"),
    @Result(column = "name", property = "name"),
    @Result(column = "age", property = "age"),
    @Result(column = "bloodType", property = "bloodType"),
    @Result(column = "diseaseName", property = "diseaseName"),
    @Result(column = "symptoms", property = "symptoms"),
    @Result(column = "latestBookingDate", property = "latestBookingDate"),
    @Result(column = "place", property = "place")
    })
    Patient findById(Integer patientId);
    // UPDATE
    @Update("UPDATE patients SET name=#{name}, age=#{age}, bloodType=#{bloodType}, diseaseName=#{diseaseName}, " +
            "symptoms=#{symptoms}, latestBookingDate=#{latestBookingDate}, place=#{place} WHERE patient_id=#{patientId}")
    void updatePatient(Patient patient);
    // DELETE
    @Delete("DELETE FROM patients WHERE patient_id = #{patientId}")
    void deletePatient(Integer patientId);
    
}
