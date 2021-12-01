package by.jonline.module5.task5a.dao;

import by.jonline.module5.task5a.dao.impl.FlowerDAOImpl;
import by.jonline.module5.task5a.dao.impl.PackDAOImpl;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	private FlowerDAO flowerDAO = new FlowerDAOImpl();
	private PackDAO packDAO = new PackDAOImpl();

	private DAOProvider() {
	}

	public static DAOProvider getInstance() {
		return instance;
	}

	public FlowerDAO getFlowerDAO() {
		return flowerDAO;
	}

	public void setFlowerDAO(FlowerDAO flowerDAO) {
		this.flowerDAO = flowerDAO;
	}

	public PackDAO getPackDAO() {
		return packDAO;
	}

	public void setPackDAO(PackDAO packDAO) {
		this.packDAO = packDAO;
	}

}
