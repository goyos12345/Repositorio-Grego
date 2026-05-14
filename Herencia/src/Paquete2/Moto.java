package Paquete2;

public class Moto extends vehiculo {
	int cantRuedasMo;
	boolean vidrioFront;
	public int getCantRuedasMo() {
		return cantRuedasMo;
	}
	public void setCantRuedasMo(int cantRuedasMo) {
		this.cantRuedasMo = cantRuedasMo;
	}
	public boolean isVidrioFront() {
		return vidrioFront;
	}
	public void setVidrioFront(boolean vidrioFront) {
		this.vidrioFront = vidrioFront;
	}
	
	public Moto(String mdMotor, double precio,String color, int ID, int cantRuedasMo, boolean vidrioFront) {
		super(mdMotor,precio,color,ID);
		this.cantRuedasMo = cantRuedasMo;
		this.vidrioFront = vidrioFront;
	}
	
	
}
