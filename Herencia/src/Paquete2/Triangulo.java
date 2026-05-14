package Paquete2;

public class Triangulo extends FiguraGeometrica{
	private String tipo;
	private double ang1;
	private double ang2;
	private double ang3;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getAng1() {
		return ang1;
	}
	public void setAng1(double ang1) {
		this.ang1 = ang1;
	}
	public double getAng2() {
		return ang2;
	}
	public void setAng2(double ang2) {
		this.ang2 = ang2;
	}
	public double getAng3() {
		return ang3;
	}
	public void setAng3(double ang3) {
		this.ang3 = ang3;
	}
	public Triangulo(int lados, int vertices, String tipo, double ang1, double ang2, double ang3) {
		super(lados, vertices);
		this.tipo = tipo;
		this.ang1 = ang1;
		this.ang2 = ang2;
		this.ang3 = ang3;
	}
	

}
