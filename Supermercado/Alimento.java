package Supermercado;

public class Alimento extends Producto {
	private String FechaVen;
	private double calorias;
	public String getFechaVen() {
		return FechaVen;
	}
	public void setFechaVen(String fechaVen) {
		FechaVen = fechaVen;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	public Alimento(double precio, String nombre, int id,String fechaVen, double calorias) {
		super(precio, nombre, id);
		FechaVen = fechaVen;
		this.calorias = calorias;
	}
	
}
