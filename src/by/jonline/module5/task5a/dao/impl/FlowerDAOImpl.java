package by.jonline.module5.task5a.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.jonline.module5.task5a.bean.Flower;
import by.jonline.module5.task5a.dao.DAOException;
import by.jonline.module5.task5a.dao.FlowerDAO;
import by.jonline.module5.task5a.factory.FlowerFactory;
import by.jonline.module5.task5a.factory.impl.FlowerFactoryImpl;

public class FlowerDAOImpl implements FlowerDAO {

	private FlowerFactory flowerFactory = new FlowerFactoryImpl();

	@Override
	public List<Flower> getFlowersFromFile(String path) throws DAOException {

		List<Flower> flowers = new ArrayList<Flower>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = null;

			while ((line = reader.readLine()) != null) {
				String[] params = line.split("\\s+");
				Flower flower = flowerFactory.getFlower(params[2], Integer.parseInt(params[5]));
				flowers.add(flower);
			}
			reader.close();

		} catch (IOException e) {
			throw new DAOException(e);
		}

		return flowers;
	}

}
