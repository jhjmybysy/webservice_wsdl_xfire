package com.sendXfire.service;

import com.sendXfire.entity.Bank;

public interface BankSer {

	/**
	 * @see 银行转账的模拟接口
	 * @param fromBack
	 * @param toBank
	 * @return Bank
	 */
	public Bank transition(Bank fromBack, Bank toBank);

}
