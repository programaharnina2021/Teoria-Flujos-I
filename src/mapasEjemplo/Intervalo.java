package mapasEjemplo;

public class Intervalo implements Comparable<Intervalo>{
	public int mostoles;
	public int jilindres;

	
	public Intervalo(int mostoles, int jilindres) {
		super();
		this.mostoles = mostoles;
		this.jilindres = jilindres;
	}


	@Override
	public int compareTo(Intervalo o) {
		return this.jilindres-o.jilindres;
	}
}
