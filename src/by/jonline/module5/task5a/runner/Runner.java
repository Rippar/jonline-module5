package by.jonline.module5.task5a.runner;

import by.jonline.module5.task5a.controller.Controller;

/*Создать консольное приложение, удовлетворяющее следующим требованиям: 
• Корректно спроектируйте и реализуйте предметную область задачи. 
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов 
проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode()

Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы 
и упаковка.*/

public class Runner {

	public static void main(String[] args) {
		Controller controller = new Controller();

		controller.getAllAvaliableFlowers();
		controller.getAllAvaliablePacks();

		for (int i = 0; i < 3; i++) {
			controller.selectFlowersForBouquet("роза");
		}

		controller.selectPackForBouquet("красный");

		controller.createBouquet();

	}

}
