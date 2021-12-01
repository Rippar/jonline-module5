package by.jonline.module5.task5a.factory;

import java.util.List;

import by.jonline.module5.task5a.bean.Bouquet;
import by.jonline.module5.task5a.bean.Flower;
import by.jonline.module5.task5a.bean.Pack;

public interface BouquetFactory {

	Bouquet getBouquet(List<Flower> flowers, Pack pack);

}
