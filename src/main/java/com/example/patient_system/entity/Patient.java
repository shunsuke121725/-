package com.example.patient_system.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

@Data
public class Patient {
    private Integer patientId;
    private String name;
    private Integer age;
    private String bloodType;
    private String diseaseName;
    private String symptoms;
    private LocalDate latestBookingDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate bookingDate;
    private String place;
    private Integer listId;
}