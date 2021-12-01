package by.jonline.module5.task4.dao;

import java.util.List;

import by.jonline.module5.task4.bean.Treasure;

public interface TreasureDAO {

	List<Treasure> readTreasuresFromFile(String path) throws DAOException;

}
