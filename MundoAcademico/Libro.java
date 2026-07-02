package MundoAcademico;

public class Libro extends Publicacion{
	private String editorial;
	private String genero;
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Libro(String autor, String titulo, int id, String editorial, String genero) {
		super(autor, titulo, id);
		this.editorial = editorial;
		this.genero = genero;
	}
	

}
