package lti.zombie.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserBean {
	
	
	@Id
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	@Column(name="city")
	private String city;
	@Column(name="age")
	private int age;
	@Column(name="phone")
	private Long phone;
	@Column(name="location")
	private String location;
	@Column(name="skill")
	private String skill;
	@Column(name="type")
	private String type;
	@Column(name="expSal")
	private int expSal;
	
	@OneToMany(mappedBy="user")
	private Set<JobBean> jobs;
	
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
	public Set<JobBean> getJobs() {
		return jobs;
	}
	public void setJobs(Set<JobBean> jobs) {
		this.jobs = jobs;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getExpSal() {
		return expSal;
	}
	public void setExpSal(int expSal) {
		this.expSal = expSal;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
