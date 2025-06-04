package com.company.attendance.controller;

import com.company.attendance.model.Attendance;
import com.company.attendance.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/mark")
    public Attendance markAttendance(
            @RequestParam Long employeeId,
            @RequestParam String status) {
        return attendanceService.markAttendance(employeeId, LocalDate.now(), status);
    }
}