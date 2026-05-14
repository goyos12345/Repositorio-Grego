package Paquete2;

public abstract class vehiculo {
	private String modMotor;
	private double precio;
	private String color;
	private int ID;
	public String getModMotor() {
		return modMotor;
	}
	public void setModMotor(String modMotor) {
		this.modMotor = modMotor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public vehiculo(String modMotor, double precio, String color,int iD) {
		this.modMotor = modMotor;
		this.precio = precio;
		this.color = color;
		this.ID=iD;
	}
	
}
