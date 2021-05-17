package org.springframework.samples.petclinic.proxy;

// https://refactoring.guru/design-patterns/proxy
// 위 링크 예제 구현 (프록시 패턴)
public class Store {

	Payment payment;

	public Store(Payment payment) {
		this.payment = payment;
	}

	public void buySomething(int amount) {
		payment.pay(amount);
	}
}
