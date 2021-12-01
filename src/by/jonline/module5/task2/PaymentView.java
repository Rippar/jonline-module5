package by.jonline.module5.task2;

import by.jonline.module5.task2.Payment.Product;

public class PaymentView {

	public void printPayment(Payment payment) {
		StringBuilder result = new StringBuilder("id платежа: " + payment.getId() + "\nСписок покупок:\n");
		for (Product p : payment.getProducts()) {
			result.append("название покупки: " + p.getName() + ", стоимость покупки: " + p.getPrice() + "\n");

		}

		System.out.println(result);

	}

}
