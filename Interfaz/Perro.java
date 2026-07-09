package Interfaz;

public class Perro implements Acciones{
	int id;
	String Nombre;
	double hambre;
	double suenno;
	

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

	public double getHambre() {
		return hambre;
	}

	public void setHambre(double hambre) {
		this.hambre = hambre;
	}

	public double getSuenno() {
		return suenno;
	}

	public void setSuenno(double suenno) {
		this.suenno = suenno;
	}
	

	public Perro(int id, String nombre, double hambre, double suenno) {
		super();
		this.id = id;
		Nombre = nombre;
		this.hambre = hambre;
		this.suenno = suenno;
	}

	@Override
	public void comer() {
		System.out.println("El perro comió 20ton de asado");
		
		
		
	}

	@Override
	public void dormir() {
		System.out.println("El perro durmió 14 horas");		
	}
	
	

}
