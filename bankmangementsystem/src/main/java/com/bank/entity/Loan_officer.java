package com.bank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loan_officer {
	private	int id ;
	private	String name;
	private	String branch_name;
	private	int salary;
	private	int age;
	private	String location;
	private	int experience_year;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getExperience_year() {
		return experience_year;
	}
	public void setExperience_year(int experience_year) {
		this.experience_year = experience_year;
	}
	@Override
	public String toString() {
		return "Loan_officer [id=" + id + ", name=" + name + ", branch_name=" + branch_name + ", salary=" + salary
				+ ", age=" + age + ", location=" + location + ", experience_year=" + experience_year + "]";
	}

}



