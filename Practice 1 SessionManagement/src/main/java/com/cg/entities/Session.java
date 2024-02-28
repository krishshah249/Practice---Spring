package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
@Entity
@Table(name="session_master")
public class Session {

	@Id
	@NotNull
	//@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id")
	private Integer id;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	@NotNull
	@Max(value=3,message="Session duration Cannot be less than 3")
	@Column(name="duration")
	private Integer duration;
	
	@NotNull
	@Column(name="faculty")
	private String faculty;
	
	@NotNull
	@Column(name="mode2")
	private String mode;
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Session(Integer id,String name, Integer duration, String faculty, String mode) {
		super();
		this.id=id;
		this.name = name;
		this.duration = duration;
		this.faculty = faculty;
		this.mode = mode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	@Override
	public String toString() {
		return "Session [id=" + id + ", name=" + name + ", duration=" + duration + ", faculty=" + faculty + ", mode="
				+ mode + "]";
	}
	
}
