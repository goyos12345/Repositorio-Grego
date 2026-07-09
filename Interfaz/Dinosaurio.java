package Interfaz;

public class Dinosaurio implements Acciones {
	int ID;
	String Nombre;
	double Hambre;
	double Suenno;
	

	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getHambre() {
		return Hambre;
	}

	public void setHambre(double hambre) {
		Hambre = hambre;
	}

	public double getSuenno() {
		return Suenno;
	}

	public void setSuenno(double suenno) {
		Suenno = suenno;
	}
	

	public Dinosaurio(int iD, String nombre, double hambre, double suenno) {
		super();
		ID = iD;
		Nombre = nombre;
		Hambre = hambre;
		Suenno = suenno;
	}

	public void comer() {
		System.out.println("El dinosaurio comió un 1tb de carne");
		
	}

	@Override
	public void dormir() {
		System.out.println("El dinosaurio durmió 0.2 horas");
		
	}
	  

}
