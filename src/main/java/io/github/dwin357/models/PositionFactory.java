package io.github.dwin357.models;

public class PositionFactory {
	public Position getChase1000() {
		Position pos = new Position();
		pos.setLender("Chase");
		pos.setTotalShares(1000);
		pos.setAvaliablePercentage(100);
		return pos;
	}
	
	public Position getWaMu500() {
		Position pos = new Position();
		pos.setLender("WaMu");
		pos.setAvaliablePercentage(100);
		pos.setTotalShares(500);
		return pos;
	}
}
