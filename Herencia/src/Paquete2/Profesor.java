package Paquete2;

public class Profesor extends Persona  {
	private double sueldo;
	private String horario;
	private String materia;
	private int puntuacion;
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public Profesor(String nombre, String apellido, int edad, int iD, double sueldo, String horario, String materia, int puntuacion) {
		super(nombre,apellido,edad,iD);
		this.sueldo = sueldo;
		this.horario = horario;
		this.materia = materia;
		this.puntuacion = puntuacion;
	}
	

}
