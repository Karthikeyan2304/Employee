package com.employee.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.app.entity.EmployeeEntity;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {

}
