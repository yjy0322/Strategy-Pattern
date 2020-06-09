package day02_demo03;

import day02_demo03.CashNormal;
import day02_demo03.CashRebate;
import day02_demo03.CashReturn;
import day02_demo03.CashSuper;

public class CashContext {
	CashSuper cashSuper;
	public CashContext(CashSuper cashSuper) {
		this.cashSuper = cashSuper;
	}
	public CashContext(String type) {
		if ("正常收费".equals(type)) {
			cashSuper = new CashNormal();
		}
		else if ("满300返100".equals(type)) {
			cashSuper = new CashReturn(300,100);
		}
		else if ("打八折".equals(type)) {
			cashSuper = new CashRebate(0.8);
		}
	}
	public double acceptCash(double money) {
		return cashSuper.acceptCash(money);
	}
}
