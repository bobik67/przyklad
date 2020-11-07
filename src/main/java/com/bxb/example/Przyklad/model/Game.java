package com.bxb.example.Przyklad.model;

public class Game {

		private String empId;
		private String gameId;
		private String actionId;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	@Override
	public String toString() {
		return "game{" + "empId='" + empId + '\'' + ", gameId='" + gameId + '\'' + ", actionId='" + actionId + '\'' + '}';
	}
}
