package Supermercado;

public class Ropa extends Producto {
	private String tela;
	private String talle;
	public String getTela() {
		return tela;
	}
	public void setTela(String tela) {
		this.tela = tela;
	}
	public String getTalle() {
		return talle;
	}
	public void setTalle(String talle) {
		this.talle = talle;
	}
	public Ropa(double precio, String nombre, int id, String tela, String talle) {
		super(precio, nombre, id);
		this.tela = tela;
		this.talle = talle;
	}
	
}
