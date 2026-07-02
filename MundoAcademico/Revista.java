package MundoAcademico;

public class Revista extends Publicacion{
	private int periodicidad;
	private int edicion;
	public int getPeriodicidad() {
		return periodicidad;
	}
	public void setPeriodicidad(int periodicidad) {
		this.periodicidad = periodicidad;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public Revista(String autor, String titulo, int id, int periodicidad, int edicion) {
		super(autor, titulo, id);
		this.periodicidad = periodicidad;
		this.edicion = edicion;
	}
	

}
