package com.me.dao;

import java.util.List;

import com.me.model.USERS;
import com.me.model.BONUS_DETAIL;
import com.me.model.BONUS_INFO;

public interface TestMapper {

	// 查询佣金信息，包含等级信息在内
	public BONUS_INFO selectBonusInfo(int id);

	// 查询用户信息
	public USERS selectUsers(int id);

	// 查询拥金明细
	public BONUS_DETAIL selectBonusDetail(int id);

	// 插入用户信息
	public void insertUsers(USERS users);
//	public void insertUsers(int id, String name, String sex, int my_code, int given_code);

	// 插入交易流水
	public void insertTransInfo(int flow, int id, float money, String time, String product);

	// 插入佣金明细
	public void insertBonusDetail(int id, int bonus_added, String time);

	// 更新佣金总额
	public void updateBonus(int bonus, int id);

}
