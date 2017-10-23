package com.sendXfire.entity;

import java.io.Serializable;

/**
 * @see 自定义数据类型的包名必须和服务端的包名一致
 * */
public class Bank implements Serializable {

	private static final long serialVersionUID = 1L;
	private String bankName;// 银行种类
	private String account;// 银行账号
	private String password;// 银行密码
	private Float balance;// 余额
	private Float money;// 转账金额
	private String prompt;// 操作提示信息
	private String opraStatus;//操作状态(1成功,0失败)

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public String getOpraStatus() {
		return opraStatus;
	}

	public void setOpraStatus(String opraStatus) {
		this.opraStatus = opraStatus;
	}

}
