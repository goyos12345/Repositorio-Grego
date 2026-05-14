package Paquete2;

public class Circulo extends FiguraGeometrica {
	private double radio;
	private double diametro;
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public Circulo(int lados, int vertices, double radio, double diametro) {
		super(lados, vertices);
		this.radio = radio;
		this.diametro = diametro;
	}
	

}
