package com.me.model;

public class BONUS_DETAIL {
	private int id;
	private int bonusAdded;
	private String time;

	public BONUS_DETAIL() {

	}

	public BONUS_DETAIL(int id, int bonusAdded, String time) {
		super();
		this.id = id;
		this.bonusAdded = bonusAdded;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBonusAdded() {
		return bonusAdded;
	}

	public void setBonusAdded(int bonusAdded) {
		this.bonusAdded = bonusAdded;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
