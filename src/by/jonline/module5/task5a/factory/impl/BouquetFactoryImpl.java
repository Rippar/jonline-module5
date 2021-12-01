package by.jonline.module5.task5a.factory.impl;

import java.util.List;

import by.jonline.module5.task5a.bean.Bouquet;
import by.jonline.module5.task5a.bean.Flower;
import by.jonline.module5.task5a.bean.Pack;
import by.jonline.module5.task5a.factory.BouquetFactory;

public class BouquetFactoryImpl implements BouquetFactory {

	public Bouquet getBouquet(List<Flower> flowers, Pack pack) {
		return new Bouquet(flowers, pack);
	}

}
