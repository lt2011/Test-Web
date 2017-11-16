package com.me.model;

import org.springframework.stereotype.Component;

/**
 * 交易信息模型
 * @author liutao
 *liutao2017年7月8日
 */
@Component
public class TRANS_INFO {
	private int flow;
	private int id;
	private float money;
	private String time;
	private String product;

	public TRANS_INFO() {

	}

	public TRANS_INFO(int flow, int id, float money, String time, String product) {
		super();
		this.flow = flow;
		this.id = id;
		this.money = money;
		this.time = time;
		this.product = product;
	}

	public int getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		this.flow = flow;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

}
