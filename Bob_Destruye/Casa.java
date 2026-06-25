package Bob_Destruye;

public class Casa extends Edificio{
	private int cantPisos;
	private double precio;
	public int getCantPisos() {
		return cantPisos;
	}
	public void setCantPisos(int cantPisos) {
		this.cantPisos = cantPisos;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Casa(String nombre, int codPostal, int cantPisos, double precio) {
		super(nombre, codPostal);
		this.cantPisos = cantPisos;
		this.precio = precio;
	}
	

}
