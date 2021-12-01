package by.jonline.module5.task4.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cave implements Serializable {

	private List<Treasure> treasures;
	private Dragon dragon;

	private static final long serialVersionUID = 4226336241639914744L;

	public Cave() {
		treasures = new ArrayList<Treasure>();
		dragon = new Dragon();
	}

	public Cave(List<Treasure> treasures, Dragon dragon) {
		this.treasures = treasures;
		this.dragon = dragon;
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	public Dragon getDragon() {
		return dragon;
	}

	public void setDragon(Dragon dragon) {
		this.dragon = dragon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dragon == null) ? 0 : dragon.hashCode());
		result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
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
		Cave other = (Cave) obj;
		if (dragon == null) {
			if (other.dragon != null)
				return false;
		} else if (!dragon.equals(other.dragon))
			return false;
		if (treasures == null) {
			if (other.treasures != null)
				return false;
		} else if (!treasures.equals(other.treasures))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " treasures=" + treasures + ", dragon=" + dragon;
	}

}
