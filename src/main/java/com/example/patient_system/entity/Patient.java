package com.example.patient_system.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Patient {
    private long patientId;
    private String name;
    private int age;
    private String bloodType;
}
