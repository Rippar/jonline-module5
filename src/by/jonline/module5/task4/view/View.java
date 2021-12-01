package by.jonline.module5.task4.view;

import java.util.List;

import by.jonline.module5.task4.bean.Cave;
import by.jonline.module5.task4.bean.Dragon;
import by.jonline.module5.task4.bean.Treasure;

public class View {

	public void printTreasureToConsole(Treasure treasure) {
		StringBuilder result = new StringBuilder();
		result.append("Тип сокровища: " + treasure.getType() + "\n");
		result.append("Стоимость сокровища: " + treasure.getValue() + "\n");

		System.out.println(result);
	}

	public void printTreasuresToConsole(List<Treasure> treasures) {
		StringBuilder result = new StringBuilder();
		for (Treasure treasure : treasures) {
			result.append("Тип сокровища: " + treasure.getType() + "\n");
			result.append("Стоимость сокровища: " + treasure.getValue() + "\n");
		}
		System.out.println(result);

	}

	public void printDragonToConsole(Dragon dragon) {
		StringBuilder result = new StringBuilder("Имя дракона: ");
		result.append(dragon.getName());
		result.append("Возраст дракона: " + dragon.getAge() + "\n");
		System.out.println(result);
	}

	public void printCaveToConsole(Cave cave) {
		StringBuilder result = new StringBuilder();
		Dragon dragon = cave.getDragon();
		List<Treasure> treasures = cave.getTreasures();

		result.append("Имя дракона в пещере:" + dragon.getName());
		result.append("Его возраст: " + dragon.getAge());

		result.append("Список сокровищ в пещере: ");
		for (Treasure treasure : treasures) {
			result.append("Тип сокровища: " + treasure.getType() + "\n");
			result.append("Стоимость сокровища: " + treasure.getValue() + "\n");

		}

	}

}
