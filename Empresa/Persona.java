package Empresa;
import java.util.Scanner;
public abstract class Persona implements Envios{
	int id;
	String Nombre;
	String Apellido;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Persona(int id, String nombre, String apellido) {
		super();
		this.id = id;
		Nombre = nombre;
		Apellido = apellido;
	}
	
	
	

}
