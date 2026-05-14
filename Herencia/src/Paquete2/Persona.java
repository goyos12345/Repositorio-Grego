package Paquete2;

public abstract class Persona {
	private String Nombre;
	private String Apellido;
	private int edad;
	private int ID;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Persona(String nombre, String apellido, int edad, int iD) {
		Nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
		ID = iD;
	}
	
	

}
