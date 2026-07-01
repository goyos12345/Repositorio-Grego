package Supermercado;

public abstract class Producto {
	int id;
	private double precio;
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Producto(double precio, String nombre, int id) {
		super();
		this.id=id;
		this.precio = precio;
		this.nombre = nombre;
	}
	

}
