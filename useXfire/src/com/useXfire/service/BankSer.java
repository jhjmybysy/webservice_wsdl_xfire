package com.useXfire.service;

import com.sendXfire.entity.Bank;

/**
 * @see �ӿڣ�BankSer��������������transition�����ǹ̶��ģ�����ҲҪ�ͷ�����һ��
 * */
public interface BankSer {

	/**
	 * @see ����ת�˵�ģ��ӿ�
	 * @param fromBack 
	 * @param toBank
	 * @return Bank
	 * */
	public Bank transition(Bank fromBack, Bank toBank);
	
}
