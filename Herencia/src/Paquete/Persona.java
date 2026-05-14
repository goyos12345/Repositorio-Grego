package Paquete;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private int cedula;
	
	public void setNombre(String n) {
		this.nombre=n;
	}
	public void setApellido(String a) {
		this.apellido=a;
	}
	public void setCI(int b) {
		this.cedula=b;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getCI() {
		return cedula;
	}
	public Persona (String n, String a, int c) {
		this.nombre=n;
		this.apellido=a;
		this.cedula=c;
	}

}
