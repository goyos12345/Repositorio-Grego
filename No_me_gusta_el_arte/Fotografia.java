package No_me_gusta_el_arte;

public class Fotografia extends ObraArte{
	private String plano;
	private String NombreCamara;
	public String getPlano() {
		return plano;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}
	public String getNombreCamara() {
		return NombreCamara;
	}
	public void setNombreCamara(String nombreCamara) {
		NombreCamara = nombreCamara;
	}
	public Fotografia(String autor, String titulo, int id, String plano, String nombreCamara) {
		super(autor, titulo, id);
		this.plano = plano;
		NombreCamara = nombreCamara;
	}
	
	

}
