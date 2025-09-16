package com.vti.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.entity.Department;

public interface IDepartmentService {

	List<Department> getAllDepartments();

	void createDepartment(Department department);

	void updateDepartment(int id, String name);

	void deleteDepartment(int id);

	Page<Department> getAllDepartments(Pageable pageable);

}
