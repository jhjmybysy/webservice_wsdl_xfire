package com.sendXfire.service;

import com.sendXfire.entity.Bank;

public interface BankSer {

	/**
	 * @see ����ת�˵�ģ��ӿ�
	 * @param fromBack
	 * @param toBank
	 * @return Bank
	 */
	public Bank transition(Bank fromBack, Bank toBank);

}
