package by.jonline.module5.task4.runner;

import by.jonline.module5.task4.controller.Controller;
import by.jonline.module5.task4.input.UserDataInput;

//Создать консольное приложение, удовлетворяющее следующим условиям:
/*
* - приложение должно быть объектноориентированным; - каждый класс должен иметь
* отражающее смысл название и информативный состав; - наследование должно
* применяться только тогда, когда это имеет смысл; - при кодировании должны
* использоваться соглашения согласно code convention; - классы должны быть
* грамотно разложенны по пакетам; - консольное меню должно быть минимальным; -
* для хранения данных можно использовать файлы.
*/
/*
* Дракон и сокровища. Создать программу, позволяющую обрабатывать сведения о
* 100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
* выбор самого дорогого по стоимости сокровища и выбора сокровищ на заданную
* сумму.
*/

public class Runner {

	public static void main(String[] args) {

		Controller controller = new Controller();
		UserDataInput userInput = new UserDataInput();

		while (true) {
			int input = userInput
					.enterFromConsole("Нажмите 1 для запуска программы, нажмите 2 для выхода из программы: ");
			if (input == 1) {

				controller.getTheMostExpensiveTreasure();
				int sum = userInput
						.enterFromConsole("Введите некоторое число для отображения сокровищ на заданную сумму: ");
				controller.getTreasuresBySum(sum);

				break;

			} else if (input == 2) {
				System.out.println("Работа программы завершена");
				break;

			} else {
				System.out.println("Введите 1 или 2!");
			}
		}

	}

}
