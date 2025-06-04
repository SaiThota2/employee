package com.company.attendance.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceId;

    @ManyToOne
    private Employee employee;

    private LocalDate date;
    private String status; // "PRESENT" or "ABSENT"

    // Constructors, getters, setters
}