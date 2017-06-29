package com.niit.leave.domain;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="Leave")
@Component
public class Leave 
{
@Id
@GeneratedValue
private int id;

private int empid;

private String name;

private String dept;

private String reason;

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

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public String getReason() {
	return reason;
}

public void setReason(String reason) {
	this.reason = reason;
}

public Date getStartdate() {
	return startdate;
}

public void setStartdate(Date startdate) {
	this.startdate = startdate;
}

public Date getEnddate() {
	return enddate;
}

public void setEnddate(Date enddate) {
	this.enddate = enddate;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

private Date startdate;

private Date enddate;
}
