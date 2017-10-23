package com.useXfire.test;

import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;
import com.sendXfire.entity.Bank;
import com.useXfire.service.BankSer;

/**
 * @see 写个main方法调用webservice
 */
public class TestBankSer {

	private static TestBankSer bean = new TestBankSer();
	/** 调用webservice的路径 */
	// http://localhost:8080/XfireSend/services/bankSer?wsdl
	private final String serviceUrl = "http://localhost:8080/XfireSend/services/bankSer";

	/**
	 * @see 把本项目的接口在webservice中实例化
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
	 * @see 接口被实例化，调用的是webservice中的方法体代码了
	 */
	public Bank transition(Bank fromBack, Bank toBank) {
		Bank bank = getBankSer().transition(fromBack, toBank);
		return bank;
	}

	public static void main(String[] args) {
		Bank fromBack = new Bank();
		fromBack.setAccount("lingtong");
		Bank toBank = new Bank();
		toBank.setPrompt("你好啊");
		System.out.println("客户端：" + bean.transition(fromBack, toBank).getPrompt());
	}

}
