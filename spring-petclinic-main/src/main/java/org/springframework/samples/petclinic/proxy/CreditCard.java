package org.springframework.samples.petclinic.proxy;

public class CreditCard implements Payment{

	Payment cash = new Cash();

	@Override
	public void pay(int amount) {
		if(amount > 100) {
			System.out.println(amount + " 시용 카드");
		} else {
			cash.pay(amount);
		}
	}
}
