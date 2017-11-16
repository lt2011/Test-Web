package com.me.model;

import org.springframework.stereotype.Component;

/**
 * 佣金信息模型
 * @author liutao
 *liutao2017年7月8日
 */
@Component
public class BONUS_INFO {
	private int id;
	private float rate;
	private int rank;
	private int bonus;

	public BONUS_INFO() {

	}

	public BONUS_INFO(int id, float rate, int rank, int bonus) {
		super();
		this.id = id;
		this.rate = rate;
		this.rank = rank;
		this.bonus = bonus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
