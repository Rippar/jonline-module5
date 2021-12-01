package by.jonline.module5.task5a.factory.impl;

import by.jonline.module5.task5a.bean.Flower;
import by.jonline.module5.task5a.factory.FlowerFactory;

public class FlowerFactoryImpl implements FlowerFactory {
	public Flower getFlower(String name, int price) {
		return new Flower(name, price);

	}

}
