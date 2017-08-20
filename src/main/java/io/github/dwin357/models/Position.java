package io.github.dwin357.models;

public class Position {
	
	int id;
	String lender;
	int security_id;
	int totalShares;
	int avaliablePercentage;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLender() {
		return lender;
	}
	public void setLender(String lender) {
		this.lender = lender;
	}
	public int getSecurity_id() {
		return security_id;
	}
	public void setSecurity_id(int security_id) {
		this.security_id = security_id;
	}
	public int getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}
	public int getAvaliablePercentage() {
		return avaliablePercentage;
	}
	public void setAvaliablePercentage(int avaliablePercentage) {
		this.avaliablePercentage = avaliablePercentage;
	}
	
}
