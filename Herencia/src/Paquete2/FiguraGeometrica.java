package Paquete2;

public abstract class FiguraGeometrica {
	private int lados;
	private int vertices;
	public int getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;
	}
	public int getVertices() {
		return vertices;
	}
	public void setVertices(int vertices) {
		this.vertices = vertices;
	}
	public FiguraGeometrica(int lados, int vertices) {
		super();
		this.lados = lados;
		this.vertices = vertices;
	}
	

}
