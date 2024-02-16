package compito.punto;

import compito.automobile.Automobile;

public class Punto extends Automobile implements Cloneable {

	private final int cilindrata;

	public Punto(String nome, int matricola) {
		super(nome);
		this.cilindrata = matricola;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	@Override
	public String toString() {
		return super.toString() + "[cilindrata=" + cilindrata + "]";
	}
	
	@Override
	public Punto clone() throws CloneNotSupportedException {
		return (Punto) super.clone();
	}


	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Punto other = (Punto) obj;
		return (cilindrata == other.cilindrata);
	}
}
