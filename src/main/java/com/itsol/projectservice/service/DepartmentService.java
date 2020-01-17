package com.itsol.projectservice.service;

import com.itsol.projectservice.domain.Department;
import com.itsol.projectservice.domain.Position;
import com.itsol.projectservice.dto.DepartmentDto;
import com.itsol.projectservice.dto.PositionDto;

import java.util.List;

public interface DepartmentService {
    List<DepartmentDto> getAllDepartment();

    void create(Department department);
    void update(Department department);
    void delete(long departmentId);
    DepartmentDto getDepartmentById(Long departmentId);
}
