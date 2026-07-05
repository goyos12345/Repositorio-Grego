package No_me_gusta_el_arte;

public abstract class ObraArte {
	private String Autor;
	private String Titulo;
	private int id;
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ObraArte(String autor, String titulo, int id) {
		super();
		Autor = autor;
		this.Titulo = titulo;
		this.id = id;
	}
	

}
