package MundoAcademico;

public abstract class Publicacion {
	private String autor;
	private String titulo;
	private int id;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Publicacion(String autor, String titulo, int id) {
		super();
		this.id=id;
		this.autor = autor;
		this.titulo = titulo;
	}

}
