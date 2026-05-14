package Paquete2;

public class  Auto extends vehiculo{
	int cantRuedasAu;
	int cantAsientos;
	int puertas;
	public int getCantRuedas() {
		return cantRuedasAu;
	}
	public void setCantRuedas(int cantRuedas) {
		this.cantRuedasAu = cantRuedas;
	}
	public int getCantAsientos() {
		return cantAsientos;
	}
	public void setCantAsientos(int cantAsientos) {
		this.cantAsientos = cantAsientos;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public Auto(String mdMotor, double precio,String color, int ID, int cantRuedas, int cantAsientos, int puertas) {
		super(mdMotor, precio, color,ID);
		this.cantRuedasAu = cantRuedas;
		this.cantAsientos = cantAsientos;
		this.puertas = puertas;
	}
	
	

}
