package no;

public class Electronica extends Producto {
	private int voltaje;
	private int mAh;
	public int getVoltaje() {
		return voltaje;
	}
	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}
	public int getmAh() {
		return mAh;
	}
	public void setmAh(int mAh) {
		this.mAh = mAh;
	}
	public Electronica(double precio, String nombre, int voltaje, int mAh) {
		super(precio, nombre);
		this.voltaje = voltaje;
		this.mAh = mAh;
	}
	

}




