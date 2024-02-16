package compito.automobile;

import java.util.Objects;

public abstract class Automobile  {

	private final String targa;

	public Automobile(String targa) {
		this.targa = targa;
	}

	public String getTarga() {
		return targa;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + "[targa=" + targa + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automobile other = (Automobile) obj;
		return Objects.equals(targa, other.targa);
//		if (targa == null) {
//			if (other.targa != null)
//				return false;
//		} else if (!targa.equals(other.targa))
//			return false;
//		return true;
	}
	
}
