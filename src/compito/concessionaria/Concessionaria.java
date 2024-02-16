package compito.concessionaria;

import java.util.ArrayList;
import java.util.function.Predicate;

import compito.automobile.Automobile;
import compito.panda.Panda;
import compito.punto.Punto;

public class Concessionaria {

	private final ArrayList<Automobile> automobiliNuove;
	private final ArrayList<Automobile> automobiliUsate;

	public Concessionaria(ArrayList<Automobile> automobiliNuove, ArrayList<Automobile> automobiliUsate) {
		this.automobiliNuove = automobiliNuove;
		this.automobiliUsate = automobiliUsate;
	}

	public void aggiungiAutomobile(Automobile a, boolean usata)
	{
		ArrayList<Automobile> temp =  usata ? automobiliUsate : automobiliNuove;
		temp.forEach(x -> 	{
			if (x.equals(a)) 
				throw new RuntimeException(a.getClass().getSimpleName()
						+" esistente");
			});
		temp.add(a);

	}
	
	public Punto compraUsata(Punto a) throws CloneNotSupportedException
	{
		return ((Punto) compraUsata(a, x ->
											((x instanceof Punto)&&((Punto)x).getCilindrata()>(a.getCilindrata()))
											)).clone();

	}
	
	public Panda compraUsata(Panda a) throws CloneNotSupportedException
	{
		return ((Panda) compraUsata(a,
									x -> (x instanceof Panda)&&(((Panda)x).hasTomTom()==(a.hasTomTom()))		
									)
				).clone();
			
	}
	
	private Automobile compraUsata(Automobile a, Predicate<Automobile> p)
	{
		for (Automobile x : automobiliUsate)
		{
			if (p.test(x)) return x;
		}
		throw new RuntimeException(a.getClass().getSimpleName()
				+" non trovata");
	}
}
