package by.jonline.module5.task4.controller;

import java.util.List;

import by.jonline.module5.task4.bean.Cave;
import by.jonline.module5.task4.bean.Dragon;
import by.jonline.module5.task4.bean.Treasure;
import by.jonline.module5.task4.logic.Logic;
import by.jonline.module5.task4.logic.LogicException;
import by.jonline.module5.task4.view.View;

public class Controller {

	private Logic logic = new Logic();
	private View view = new View();

	private Cave cave;

	public Controller() {

		try {
			List<Treasure> treasures = logic
					.getTreasuresFromFile("src/by/jonline/module5/task4/filestorage/Treasure.txt");
			Dragon dragon = new Dragon("Smaug", 2000);
			cave = new Cave(treasures, dragon);

		} catch (LogicException e) {
			e.printStackTrace();

		}

	}

	public void getAllTreasures() {
		view.printTreasuresToConsole(cave.getTreasures());
	}

	public void getTheMostExpensiveTreasure() {
		Treasure expensiveTreasure = logic.getTheMostExpensiveTreasure(cave);
		view.printTreasureToConsole(expensiveTreasure);
	}

	public void getTreasuresBySum(int sum) {
		List<Treasure> treasures = logic.getTreasuresBySum(cave, sum);
		view.printTreasuresToConsole(treasures);
	}

}
