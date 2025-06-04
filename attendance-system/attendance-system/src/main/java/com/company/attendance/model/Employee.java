package com.company.attendance.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String name;
    private String department;
    private String designation;
    private String username;
    private String password;
    private String role; // "EMPLOYEE" or "MANAGER"

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Attendance> attendances;

    // Constructors, getters, setters
}