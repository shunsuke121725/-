package com.example.patient_system.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class Lists {

    private Integer list_id;
    private String name;
    private String place;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate latestBookingDate;

    
    
}
