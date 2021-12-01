package by.jonline.module5.task5a.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.jonline.module5.task5a.bean.Pack;
import by.jonline.module5.task5a.dao.DAOException;
import by.jonline.module5.task5a.dao.PackDAO;
import by.jonline.module5.task5a.factory.PackFactory;
import by.jonline.module5.task5a.factory.impl.PackFactoryImpl;

public class PackDAOImpl implements PackDAO {

	private PackFactory packFactory = new PackFactoryImpl();

	@Override
	public List<Pack> getPacksFromFile(String path) throws DAOException {
		List<Pack> packs = new ArrayList<Pack>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = null;

			while ((line = reader.readLine()) != null) {
				String[] params = line.split("\\s+");
				Pack pack = packFactory.getPack(params[2], params[5]);
				packs.add(pack);
			}
			reader.close();

		} catch (IOException e) {
			throw new DAOException(e);
		}

		return packs;
	}

}
