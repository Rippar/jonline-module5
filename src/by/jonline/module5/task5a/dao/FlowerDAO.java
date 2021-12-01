package by.jonline.module5.task5a.dao;

import java.util.List;

import by.jonline.module5.task5a.bean.Flower;

public interface FlowerDAO {

	List<Flower> getFlowersFromFile(String path) throws DAOException;

}
