package No_me_gusta_el_arte;

public class Pintura extends ObraArte{
	private String Tecnica;
	private String Estilo;
	public String getTecnica() {
		return Tecnica;
	}
	public void setTecnica(String tecnica) {
		Tecnica = tecnica;
	}
	public String getEstilo() {
		return Estilo;
	}
	public void setEstilo(String estilo) {
		Estilo = estilo;
	}
	public Pintura(String autor, String titulo, int id, String tecnica, String estilo) {
		super(autor, titulo, id);
		Tecnica = tecnica;
		Estilo = estilo;
	}
	

}
