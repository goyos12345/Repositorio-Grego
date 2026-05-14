package Paquete2;

public class Alumno extends Persona{
	double nota; //así todo el mundo lo ve y se fomenta el tener notas altas
	private String curso;
	private int nivel;
	private double faltas;
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public double getFaltas() {
		return faltas;
	}
	public void setFaltas(double faltas) {
		this.faltas = faltas;
	}
	public Alumno(String nombre, String apellido, int edad, int iD, double nota, String curso, int nivel, double faltas) {
		super(nombre,apellido,edad,iD);
		this.nota = nota;
		this.curso = curso;
		this.nivel = nivel;
		this.faltas = faltas;
	}
	
	

}
