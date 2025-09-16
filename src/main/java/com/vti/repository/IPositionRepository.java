package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vti.entity.Position;

@Repository
public interface IPositionRepository extends JpaRepository<Position, Integer> {
	Position findById(int id);
}
