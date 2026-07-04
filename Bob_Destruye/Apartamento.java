package Bob_Destruye;

public class Apartamento extends Edificio {
	private int piso;
	private String nomEdificio;

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getNomEdificio() {
		return nomEdificio;
	}

	public void setNomEdificio(String nomEdificio) {
		this.nomEdificio = nomEdificio;
	}

	public Apartamento(String nombre, int codPostal,int id, int piso, String nomEdificio) {
		super(nombre, codPostal, id);
		this.piso = piso;
		this.nomEdificio = nomEdificio;
	}

}
