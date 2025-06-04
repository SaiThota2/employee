package com.company.attendance.repository;

import com.company.attendance.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    List<Attendance> findByEmployeeEmployeeId(Long employeeId);
    List<Attendance> findByEmployeeDepartment(String department);
    List<Attendance> findByDateBetween(LocalDate startDate, LocalDate endDate);
}