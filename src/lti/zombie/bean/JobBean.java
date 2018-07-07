package lti.zombie.bean;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="job")
@SequenceGenerator(name="jobid",sequenceName="job_seq")
public class JobBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int jobId;
	private String status;
	
	@ManyToOne
	@JoinColumn(name="email")
	private UserBean user;
	
	@ManyToOne
	@JoinColumn(name="reqId")
	private RequirementBean requirement;
	
	

	
	
	
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	public RequirementBean getRequirement() {
		return requirement;
	}
	public void setRequirement(RequirementBean requirement) {
		this.requirement = requirement;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
