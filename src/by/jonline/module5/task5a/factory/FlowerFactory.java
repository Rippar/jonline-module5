package by.jonline.module5.task5a.factory;

import by.jonline.module5.task5a.bean.Flower;

public interface FlowerFactory {

	Flower getFlower(String name, int price);

}
