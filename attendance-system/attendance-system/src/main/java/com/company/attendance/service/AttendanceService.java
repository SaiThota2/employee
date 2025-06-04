package com.company.attendance.service;

import com.company.attendance.model.Attendance;
import com.company.attendance.model.Employee;
import com.company.attendance.repository.AttendanceRepository;
import com.company.attendance.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public Attendance markAttendance(Long employeeId, LocalDate date, String status) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow();
        Attendance attendance = new Attendance();
        attendance.setEmployee(employee);
        attendance.setDate(date);
        attendance.setStatus(status);
        return attendanceRepository.save(attendance);
    }

    public List<Attendance> getEmployeeAttendance(Long employeeId) {
        return attendanceRepository.findByEmployeeEmployeeId(employeeId);
    }

    public List<Attendance> getDepartmentAttendance(String department) {
        return attendanceRepository.findByEmployeeDepartment(department);
    }
}