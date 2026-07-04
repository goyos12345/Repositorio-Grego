package Bob_Destruye;

public abstract class Edificio {
	private int id;
	private String nombre;
	private int codPostal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}
	public Edificio(String nombre, int codPostal, int id) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.codPostal = codPostal;
	}
	
	
}
