package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vti.entity.Department;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

	@Modifying
	@Query("UPDATE Department d SET d.name = :nameParameter WHERE d.id = :idParameter")
	void updateDepartmentNameById(@Param("idParameter") int id, @Param("nameParameter") String name);

	Department findById(int id);
}
