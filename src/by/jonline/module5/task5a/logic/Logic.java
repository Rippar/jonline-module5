package by.jonline.module5.task5a.logic;

import java.util.List;

import by.jonline.module5.task5a.bean.Bouquet;
import by.jonline.module5.task5a.bean.Flower;
import by.jonline.module5.task5a.bean.Pack;
import by.jonline.module5.task5a.dao.DAOException;
import by.jonline.module5.task5a.dao.DAOProvider;
import by.jonline.module5.task5a.dao.FlowerDAO;
import by.jonline.module5.task5a.dao.PackDAO;
import by.jonline.module5.task5a.factory.BouquetFactory;
import by.jonline.module5.task5a.factory.impl.BouquetFactoryImpl;

public class Logic {

	private final DAOProvider provider = DAOProvider.getInstance();
	private BouquetFactory bouquetFactory = new BouquetFactoryImpl();

	public Bouquet createBouquet(List<Flower> flowers, Pack pack) {
		return bouquetFactory.getBouquet(flowers, pack);
	}

	public List<Flower> getFlowersFromFile(String path) throws LogicException {

		FlowerDAO flowerDAO = provider.getFlowerDAO();
		List<Flower> flowers = null;
		try {
			flowers = flowerDAO.getFlowersFromFile(path);
		} catch (DAOException e) {
			throw new LogicException(e);

		}
		return flowers;
	}

	public List<Pack> getPacksFromFile(String path) throws LogicException {
		PackDAO packDAO = provider.getPackDAO();
		List<Pack> packs = null;

		try {
			packs = packDAO.getPacksFromFile(path);
		} catch (DAOException e) {
			throw new LogicException(e);
		}
		return packs;
	}

	public boolean validateInput(String input) {
		return input.matches("[а-яА-ЯёЁ]+");
	}

}
