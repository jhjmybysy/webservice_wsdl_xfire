package com.sendXfire.service.impl;

import com.sendXfire.entity.Bank;
import com.sendXfire.service.BankSer;

public class BankSerImpl implements BankSer {

	public Bank transition(Bank fromBack, Bank toBank) {
		System.out.println("账号：" + fromBack.getAccount());
		System.out.println("提示：" + toBank.getPrompt());
		fromBack.setPassword("");
		fromBack.setOpraStatus("1");
		fromBack.setPrompt("转账成功！");
		return fromBack;
	}

}
