package com.employee.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.app.entity.EmployeeEntity;
import com.employee.app.repo.EmployeeRepo;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepo repo;
	
	
	
	public void saveEmployee(EmployeeEntity employee)
	{
		repo.save(employee);
	}
	
	
	
	
	public List<EmployeeEntity> getemployeelist()
	{
		return repo.findAll();
	}
	
	public EmployeeEntity getEmployeeById(int id)
	{
		 return repo.findById(id).get();
	}
	
	
	public EmployeeEntity updateEmployeeById(@PathVariable  ("id")int id, EmployeeEntity employee)
	{
		EmployeeEntity employee1=repo.findById(id).get();		
		employee1.setName(employee.getName());
		employee1.setAge(employee.getAge());
		employee1.setGender(employee.getGender());
	    return repo.save(employee1);
	}
	
	
	
	public void getdelEmployee(@PathVariable("id") int id)
	{
repo.deleteById(id);		
	}
	
	
}
