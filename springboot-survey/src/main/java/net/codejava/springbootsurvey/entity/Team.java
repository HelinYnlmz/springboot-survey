package net.codejava.springbootsurvey.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Team {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long t_id;
	
	@Column(name="first_name", nullable=false)
	private String tfirstName;
	@Column(name="last_name")
	private String tlastName;
	
	@Column(name="gender")
	private String tgender;
	@Column(name="date")
	private String tdate;
	@Column(name="team")
	private String team;
	public Long getT_id() {
		return t_id;
	}
	
	public Team() {
		
	}
	
	
	public Team(String tfirstName, String tlastName, String tgender, String tdate, String team) {
		super();
		this.tfirstName = tfirstName;
		this.tlastName = tlastName;
		this.tgender = tgender;
		this.tdate = tdate;
		this.team = team;
	}




	public void setT_id(Long t_id) {
		this.t_id = t_id;
	}
	public String getTfirstName() {
		return tfirstName;
	}
	public void setTfirstName(String tfirstName) {
		this.tfirstName = tfirstName;
	}
	public String getTlastName() {
		return tlastName;
	}
	public void setTlastName(String tlastName) {
		this.tlastName = tlastName;
	}
	public String getTgender() {
		return tgender;
	}
	public void setTgender(String tgender) {
		this.tgender = tgender;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
}
