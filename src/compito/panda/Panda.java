package compito.panda;

import compito.automobile.Automobile;

public class Panda extends Automobile implements Cloneable{

	private final boolean hasTomTom;

	public Panda(String targa, boolean hasTomTom) {
		super(targa);
		this.hasTomTom = hasTomTom;
	}

	public boolean hasTomTom() {
		return hasTomTom;
	}

	@Override
	public String toString() {
		return super.toString() + "[hasTomTom=" + hasTomTom + "]";
	}
	
	@Override
	public Panda clone() throws CloneNotSupportedException {
		return (Panda) super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Panda other = (Panda) obj;
		return (hasTomTom == other.hasTomTom);
	}

}
