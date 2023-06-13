package com.employee.app.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class EmployeeEntity {
@GeneratedValue(strategy =GenerationType.IDENTITY)
@Id

@Column(name="id")
int id;
@Column(name="name")
String name;
@Column(name="age")
int age;

@Column(name="gender")
String gender;

public EmployeeEntity() {
	
}

public EmployeeEntity(int id,String name, int age, String gender) {
	super();
	this.id=id;
	this.name = name;
	this.age = age;
	this.gender = gender;
}

public int getid()
{
return id;
}

public void setid(int id)
{
this.id=id;	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
return "EmployeeEntity [id "+id+",name=" + name + ", age=" + age + ", gender=" + gender + "]";
}
}
