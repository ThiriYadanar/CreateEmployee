package com.springboot.tutorial.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employee")
@Getter
@Setter
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
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date joiningDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "retiringDate")
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date retiringDate;
	
	@Column(name="dept")
	private String dept;


	protected Employee(int id, String name, int age,String depart, String gender,Date jDate,Date rDate) {
		super();
		this.id = id;
		this.name = name;
		this.age=age;
		this.dept=depart;
		this.gender=gender;
		this.joiningDate=jDate;
		this.retiringDate=rDate;
	}
	public Employee() {
	}	
}
