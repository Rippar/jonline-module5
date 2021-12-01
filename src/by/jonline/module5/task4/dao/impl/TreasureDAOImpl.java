package by.jonline.module5.task4.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.jonline.module5.task4.bean.Treasure;
import by.jonline.module5.task4.dao.DAOException;
import by.jonline.module5.task4.dao.TreasureDAO;

public class TreasureDAOImpl implements TreasureDAO {

	@Override
	public List<Treasure> readTreasuresFromFile(String path) throws DAOException {

		List<Treasure> treasures = new ArrayList<Treasure>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = null;

			while ((line = reader.readLine()) != null) {
				String[] params = line.split("\\s+");
				treasures.add(new Treasure(params[2], Integer.parseInt(params[5])));
			}
			reader.close();

		} catch (IOException e) {
			throw new DAOException(e);
		}

		return treasures;

	}

}
