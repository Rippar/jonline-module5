package by.jonline.module5.task2;

import by.jonline.module5.task2.Payment.Product;

public class PaymentLogic {
	
	public double calculateTotalSum(Payment payment) {
		double sum = 0.0;
		
		for (Product p : payment.getProducts()) {
			sum+=p.getPrice();
		}
		
		return sum;
	}

}
