package by.jonline.module5.task5a.dao;

import java.util.List;

import by.jonline.module5.task5a.bean.Pack;

public interface PackDAO {

	List<Pack> getPacksFromFile(String path) throws DAOException;

}
