package com.example.patient_system;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.patient_system.mapper")
public class PatientManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(PatientManagementApplication.class, args);
    }
}
