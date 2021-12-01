package by.jonline.module5.task2;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.*/

public class PaymentRunner {

	public static void main(String[] args) {

		PaymentView view = new PaymentView();

		Payment payment = new Payment();

		payment.addProduct(new Payment.Product("milk", 1.50));
		payment.addProduct(new Payment.Product("cheese", 3.99));
		payment.addProduct(new Payment.Product("pork", 10.99));

		view.printPayment(payment);

	}

}
