package com.mps.model;

public class Ticket {
	private String name;
	private String idcard;
	private String flight;
	private String startPoint;
	private String endPoint;

	public Ticket() {

	}

	public Ticket(String name, String idcard, String flight, String startPoint, String endPoint) {
		super();
		this.name = name;
		this.idcard = idcard;
		this.flight = flight;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

}
