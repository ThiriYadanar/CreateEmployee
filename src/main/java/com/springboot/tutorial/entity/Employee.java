package com.springboot.tutorial.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="employee")
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "gender")
	private String gender;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "joiningDate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date joiningDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "retiringDate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date retiringDate;
	
	@Column(name="dept")
	private String dept;

}
