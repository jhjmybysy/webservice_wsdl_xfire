package com.sendXfire.service.impl;

import com.sendXfire.entity.Bank;
import com.sendXfire.service.BankSer;

public class BankSerImpl implements BankSer {

	public Bank transition(Bank fromBack, Bank toBank) {
		System.out.println("�˺ţ�" + fromBack.getAccount());
		System.out.println("��ʾ��" + toBank.getPrompt());
		fromBack.setPassword("");
		fromBack.setOpraStatus("1");
		fromBack.setPrompt("ת�˳ɹ���");
		return fromBack;
	}

}
