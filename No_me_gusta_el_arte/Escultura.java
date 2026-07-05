package No_me_gusta_el_arte;

public class Escultura extends ObraArte{
	private String Material;
	private double Altura;//cm
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	public Escultura(String autor, String titulo, int id, String material, double altura) {
		super(autor, titulo, id);
		Material = material;
		Altura = altura;
	}
	

}
