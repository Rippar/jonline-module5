package by.jonline.module5.task4.dao;

import by.jonline.module5.task4.dao.impl.TreasureDAOImpl;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	private TreasureDAO treasureDAO = new TreasureDAOImpl();

	private DAOProvider() {
	};

	public static DAOProvider getInstance() {
		return instance;
	}

	public TreasureDAO getTreasureDAO() {
		return treasureDAO;
	}

	public void setTreasureDAO(TreasureDAO treasureDAO) {
		this.treasureDAO = treasureDAO;
	}

}
