package com.useXfire.service;

import com.sendXfire.entity.Bank;

/**
 * @see 接口，BankSer可以随意命名，transition必须是固定的，参数也要和发布方一致
 * */
public interface BankSer {

	/**
	 * @see 银行转账的模拟接口
	 * @param fromBack 
	 * @param toBank
	 * @return Bank
	 * */
	public Bank transition(Bank fromBack, Bank toBank);
	
}
