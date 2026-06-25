package Bob_Destruye;

public abstract class Edificio {
	private String nombre;
	private int codPostal;
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
	public Edificio(String nombre, int codPostal) {
		super();
		this.nombre = nombre;
		this.codPostal = codPostal;
	}
	
	
}
