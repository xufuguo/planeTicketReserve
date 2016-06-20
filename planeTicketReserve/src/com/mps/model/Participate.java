package com.mps.model;
// Generated 2016-6-18 9:41:43 by Hibernate Tools 4.3.1.Final

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Participate generated by hbm2java
 */
@XmlRootElement(name="Participate")
public class Participate implements java.io.Serializable {
	private static final long serialVersionUID = -3267943602377867495L;
	
	private int id;
	private Team team;
	private Traveller traveller;
	private Date jointime;

	public Participate() {
	}

	public Participate(int id, Team team, Traveller traveller, Date jointime) {
		this.id = id;
		this.team = team;
		this.traveller = traveller;
		this.jointime = jointime;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Traveller getTraveller() {
		return this.traveller;
	}

	public void setTraveller(Traveller traveller) {
		this.traveller = traveller;
	}

	public Date getJointime() {
		return this.jointime;
	}

	public void setJointime(Date jointime) {
		this.jointime = jointime;
	}

	@Override
	public String toString() {
		return "Participate [id=" + id + ", team=" + team + ", traveller=" + traveller + ", jointime=" + jointime + "]";
	}
	
}
