package noticiero;

public class ArtículoCientífico extends Publicacion {
	private String Revision;
	private String materia;
	public String getRevision() {
		return Revision;
	}
	public void setRevision(String revision) {
		Revision = revision;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public ArtículoCientífico(String autor, String titulo, String revision, String materia) {
		super(autor, titulo);
		Revision = revision;
		this.materia = materia;
	}
	
	
	

}
