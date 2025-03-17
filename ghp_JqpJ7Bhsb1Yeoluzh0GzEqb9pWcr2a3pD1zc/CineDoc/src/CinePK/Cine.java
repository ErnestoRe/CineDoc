package CinePK;

public class Cine {

	/**
	 * Creamos las variables
	 */
	private int aforo;
	private int butacasOcupadas;
	private String tituloPelicula;
	private int precioEntrada;
	
	/**
	 * Constructor sin parametros
	 * @return
	 */
	public Cine() {
		super();
		aforo = 100;
		butacasOcupadas = 0;
		tituloPelicula = "Por determinar";
		precioEntrada = 5;
	}

	/**
	 * Constructor con 1 parametros
	 * @param aforo int
	 */
	public Cine(int aforo) {
		super();
		this.aforo = aforo;
		butacasOcupadas = 0;
		tituloPelicula = "Por determinar";
		precioEntrada = 5;
	}

	/**
	 * Constructor con 3 parametros
	 * @param aforo int
	 * @param tituloPelicula String
	 * @param precioEntrada int
	 */
	public Cine(int aforo, String tituloPelicula, int precioEntrada) {
		super();
		this.aforo = aforo;
		butacasOcupadas = 0;
		this.tituloPelicula = tituloPelicula;
		this.precioEntrada = precioEntrada;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public int getButacasOcupadas() {
		return butacasOcupadas;
	}

	public void setButacasOcupadas(int butacasOcupadas) {
		this.butacasOcupadas = butacasOcupadas;
	}

	public String getTituloPelicula() {
		return tituloPelicula;
	}

	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}

	public int getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	@Override
	public String toString() {
		return "Cine [aforo=" + aforo + ", butacasOcupadas=" + butacasOcupadas + ", tituloPelicula=" + tituloPelicula
				+ ", precioEntrada=" + precioEntrada + "]";
	}
	
	public int butacasLibre() {
		return aforo - butacasOcupadas;
	}
	
	public int porcentajeOcupacion() {
		return butacasOcupadas / aforo * 100;
	}
	
	
}
