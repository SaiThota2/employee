package com.company.attendance.controller;

import com.company.attendance.model.Attendance;
import com.company.attendance.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("/employee/{employeeId}")
    public List<Attendance> getEmployeeReport(@PathVariable Long employeeId) {
        return attendanceService.getEmployeeAttendance(employeeId);
    }

    @GetMapping("/department/{department}")
    public List<Attendance> getDepartmentReport(@PathVariable String department) {
        return attendanceService.getDepartmentAttendance(department);
    }
}