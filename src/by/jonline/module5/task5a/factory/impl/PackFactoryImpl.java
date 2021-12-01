package by.jonline.module5.task5a.factory.impl;

import by.jonline.module5.task5a.bean.Pack;
import by.jonline.module5.task5a.factory.PackFactory;

public class PackFactoryImpl implements PackFactory {

	public Pack getPack(String color, String material) {
		return new Pack(color, material);
	}

}
