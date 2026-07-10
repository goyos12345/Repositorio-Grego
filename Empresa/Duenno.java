package Empresa;

public class Duenno extends Persona implements Envios {
	double guita;

	public double getGuita() {
		return guita;
	}

	public void setGuita(double guita) {
		this.guita = guita;
	}

	public Duenno(int id, String nombre, String apellido, double guita) {
		super(id, nombre, apellido);
		this.guita = guita;
	}

	@Override
	public void enviarEM(int id, Empleados E, Duenno D, Encargado En) {

		if (id == En.getId()) {
			System.out.println("Mail enviado");

		} else if (id != En.getId()) {
			System.out.println("No se ha podido comunicar con esta persona");
		}

	}
}
 