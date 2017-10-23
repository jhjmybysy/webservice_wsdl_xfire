package com.useXfire.test;

import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;
import com.sendXfire.entity.Bank;
import com.useXfire.service.BankSer;

/**
 * @see д��main��������webservice
 */
public class TestBankSer {

	private static TestBankSer bean = new TestBankSer();
	/** ����webservice��·�� */
	// http://localhost:8080/XfireSend/services/bankSer?wsdl
	private final String serviceUrl = "http://localhost:8080/XfireSend/services/bankSer";

	/**
	 * @see �ѱ���Ŀ�Ľӿ���webservice��ʵ����
	 */
	public BankSer getBankSer() {
		BankSer bankSer = null;
		try {
			Service service = new ObjectServiceFactory().create(BankSer.class);
			bankSer = (BankSer) new XFireProxyFactory().create(service, serviceUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bankSer;
	}

	/**
	 * @see �ӿڱ�ʵ���������õ���webservice�еķ����������
	 */
	public Bank transition(Bank fromBack, Bank toBank) {
		Bank bank = getBankSer().transition(fromBack, toBank);
		return bank;
	}

	public static void main(String[] args) {
		Bank fromBack = new Bank();
		fromBack.setAccount("lingtong");
		Bank toBank = new Bank();
		toBank.setPrompt("��ð�");
		System.out.println("�ͻ��ˣ�" + bean.transition(fromBack, toBank).getPrompt());
	}

}
