package by.jonline.module5.task5a.view;

import java.util.List;

import by.jonline.module5.task5a.bean.Bouquet;
import by.jonline.module5.task5a.bean.Flower;
import by.jonline.module5.task5a.bean.Pack;

public class View {

	public void printFlowersToConsole(List<Flower> flowers) {
		StringBuilder result = new StringBuilder();

		for (Flower flower : flowers) {
			result.append("Наименование цветка: " + flower.getName() + "\n");
			result.append("Стоимость цветка: " + flower.getPrice() + "\n");

		}

		System.out.println(result + "\n");
	}

	public void printPacksToConsole(List<Pack> packs) {
		StringBuilder result = new StringBuilder();

		for (Pack pack : packs) {
			result.append("Цвет упаковки: " + pack.getColor() + "\n");
			result.append("Тип материала: " + pack.getMaterial() + "\n");

		}

		System.out.println(result + "\n");
	}

	public void printBouquetToConsole(Bouquet bouquet) {
		StringBuilder result = new StringBuilder();

		for (Flower flower : bouquet.getFlowers()) {
			result.append("Наименование цветка: " + flower.getName() + "\n");
			result.append("Стоимость цветка: " + flower.getPrice() + "\n");
		}

		result.append("Цвет упаковки: " + bouquet.getPack().getColor() + "\n");
		result.append("Тип материала: " + bouquet.getPack().getMaterial() + "\n");

		System.out.println(result + "\n");

	}

}
