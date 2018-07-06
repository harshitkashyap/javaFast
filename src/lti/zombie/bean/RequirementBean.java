package lti.zombie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="req_table")
@SequenceGenerator(name="reqId", sequenceName="req_seq")
public class RequirementBean {
	
	
private String company;
private String type;
private String location;
private String skill;

@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int reqId;
private int experience;
private double salary;


public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}

public int getReqId() {
	return reqId;
}
public void setReqId(int reqId) {
	this.reqId = reqId;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}
