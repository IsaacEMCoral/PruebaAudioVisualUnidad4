package model;

public abstract class ContenidoAudiovisual {
	private static int contar = 1;
	private String titulo;
	private int duracionEnMinutos;
	private String genero;
	private int id;

	public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
		this.id = contar++;
		this.titulo = titulo;
		this.duracionEnMinutos = duracionEnMinutos;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracionEnMinutos() {
		return duracionEnMinutos;
	}

	public void setDuracionEnMinutos(int duracionEnMinutos) {
		this.duracionEnMinutos = duracionEnMinutos;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	//Metodo para mostrar los detalles de las clases
	public abstract void mostrarDetalles();
}