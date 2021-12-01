package by.jonline.module5.task5a.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bouquet implements Serializable {

	private List<Flower> flowers;
	private Pack pack;

	private static final long serialVersionUID = 38343396317932704L;

	public Bouquet() {
		flowers = new ArrayList<Flower>();
		pack = new Pack();
	}

	public Bouquet(List<Flower> flowers, Pack pack) {
		this.flowers = flowers;
		this.pack = pack;
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}

	public Pack getPack() {
		return pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
		result = prime * result + ((pack == null) ? 0 : pack.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bouquet other = (Bouquet) obj;
		if (flowers == null) {
			if (other.flowers != null)
				return false;
		} else if (!flowers.equals(other.flowers))
			return false;
		if (pack == null) {
			if (other.pack != null)
				return false;
		} else if (!pack.equals(other.pack))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " flowers=" + flowers + ", pack=" + pack;
	}

}
