package by.jonline.module5.task4.logic;

import java.util.ArrayList;
import java.util.List;

import by.jonline.module5.task4.bean.Cave;
import by.jonline.module5.task4.bean.Treasure;
import by.jonline.module5.task4.dao.DAOException;
import by.jonline.module5.task4.dao.DAOProvider;
import by.jonline.module5.task4.dao.TreasureDAO;

public class Logic {

	private final DAOProvider provider = DAOProvider.getInstance();

	public List<Treasure> getTreasuresFromFile(String path) throws LogicException {

		TreasureDAO treasureDAO = provider.getTreasureDAO();
		List<Treasure> treasures = null;

		try {
			treasures = treasureDAO.readTreasuresFromFile(path);
		} catch (DAOException e) {
			throw new LogicException(e);
		}

		return treasures;
	}

	public List<Treasure> getAllTreasures(Cave cave) {
		return cave.getTreasures();
	}

	public Treasure getTheMostExpensiveTreasure(Cave cave) {
		List<Treasure> treasures = cave.getTreasures();
		int maxValue = Integer.MIN_VALUE;
		Treasure selectedTreasure = null;

		for (Treasure treasure : treasures) {
			if (treasure.getValue() > maxValue) {
				selectedTreasure = treasure;
				maxValue = treasure.getValue();
			}
		}

		return selectedTreasure;

	}

	public List<Treasure> getTreasuresBySum(Cave cave, int sum) {
		List<Treasure> treasures = cave.getTreasures();
		List<Treasure> selectedTreasures = new ArrayList<Treasure>();
		int currentSum = 0;

		for (Treasure treasure : treasures) {
			if (treasure.getValue() + currentSum <= sum) {
				selectedTreasures.add(treasure);
				currentSum += treasure.getValue();
			}
		}

		return selectedTreasures;

	}

}
