package com.sendXfire.entity;

import java.io.Serializable;

/**
 * @see �Զ����������͵İ�������ͷ���˵İ���һ��
 * */
public class Bank implements Serializable {

	private static final long serialVersionUID = 1L;
	private String bankName;// ��������
	private String account;// �����˺�
	private String password;// ��������
	private Float balance;// ���
	private Float money;// ת�˽��
	private String prompt;// ������ʾ��Ϣ
	private String opraStatus;//����״̬(1�ɹ�,0ʧ��)

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
