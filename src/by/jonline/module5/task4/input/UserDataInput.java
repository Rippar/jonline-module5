package by.jonline.module5.task4.input;

import java.util.Scanner;

public class UserDataInput {
	public int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Нужно ввести целое число!: ");

		}
		return sc.nextInt();
	}

}