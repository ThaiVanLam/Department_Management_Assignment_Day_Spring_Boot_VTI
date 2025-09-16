package com.vti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vti.entity.Department;
import com.vti.repository.IDepartmentRepository;

@Service
@Transactional
public class DepartmentService implements IDepartmentService {
	@Autowired
	private IDepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public void createDepartment(Department department) {
		departmentRepository.save(department);
	}

	@Override
	public void updateDepartment(int id, String name) {
		departmentRepository.updateDepartmentNameById(id, name);
	}

	@Override
	public void deleteDepartment(int id) {
		departmentRepository.deleteById(id);
	}

	@Override
	public Page<Department> getAllDepartments(Pageable pageable) {
		return departmentRepository.findAll(pageable);
	}
}
