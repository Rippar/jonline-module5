package by.jonline.module5.task5a.controller;

import java.util.ArrayList;
import java.util.List;

import by.jonline.module5.task5a.bean.Bouquet;
import by.jonline.module5.task5a.bean.Flower;
import by.jonline.module5.task5a.bean.Pack;
import by.jonline.module5.task5a.logic.Logic;
import by.jonline.module5.task5a.logic.LogicException;
import by.jonline.module5.task5a.view.View;

public class Controller {

	private Logic logic = new Logic();
	private View view = new View();

	private List<Flower> flowers;
	private List<Pack> packs;

	private List<Flower> selectedFlowers;
	private Pack selectedPack;

	public Controller() {
		try {
			flowers = logic.getFlowersFromFile("src/by/jonline/module5/task5a/filestorage/Flowers.txt");
			packs = logic.getPacksFromFile("src/by/jonline/module5/task5a/filestorage/Packs.txt");
			selectedFlowers = new ArrayList<Flower>();
			selectedPack = new Pack();

		} catch (LogicException e) {
			e.printStackTrace();

		}

	}

	public Controller(String path) {
		try {
			flowers = logic.getFlowersFromFile(path);
			packs = logic.getPacksFromFile(path);
			selectedFlowers = new ArrayList<Flower>();
			selectedPack = new Pack();

		} catch (LogicException e) {
			e.printStackTrace();

		}

	}

	public void getAllAvaliableFlowers() {
		view.printFlowersToConsole(flowers);
	}

	public void getAllAvaliablePacks() {
		view.printPacksToConsole(packs);
	}

	public boolean selectFlowersForBouquet(String flowerName) {
		boolean isValidatedInput = logic.validateInput(flowerName);

		if (isValidatedInput) {
			for (Flower flower : flowers) {
				String tmp = flower.getName();
				if (tmp.equalsIgnoreCase(flowerName)) {
					selectedFlowers.add(flower);
					break;
				}
			}
		}

		return isValidatedInput;

	}

	public boolean selectPackForBouquet(String packColor) {
		boolean isValidatedInput = logic.validateInput(packColor);

		if (isValidatedInput) {
			for (Pack pack : packs) {
				String tmp = pack.getColor();
				if (tmp.equalsIgnoreCase(packColor)) {
					selectedPack = pack;
					break;
				}
			}
		}

		return isValidatedInput;

	}

	public void createBouquet() {
		Bouquet createdBouquet = new Bouquet(selectedFlowers, selectedPack);
		view.printBouquetToConsole(createdBouquet);
	}

}
