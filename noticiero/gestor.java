package noticiero;

import java.util.Scanner;

public class gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Libro lib1 = new Libro(null, null, null, null);
		Revista rev1 = new Revista(null, null, 0, 0);
		ArtículoCientífico art1 = new ArtículoCientífico(null, null, null, null);
		System.out.println("------------------Ingresando datos de Libro----------------");
		int rut = 1;
		// La variable "rut" sirve para indicar a que objeto se le van a agregar los  ndatos, así escribo menos
		ingreso(rut, lib1, rev1, art1);
		System.out.println("Ingrese el nombre de la editorial (use ¨_¨ en vez de espacios): ");
		String ed = sc.next();
		lib1.setEditorial(ed);
		System.out.println("Ingrese el género");
		String ge = sc.next();
		lib1.setGenero(ge);
		System.out.println("------------------Ingresando datos de Revista----------------");
		rut = 2;
		ingreso(rut, lib1, rev1, art1);
		System.out.println("Ingrese la edicion (número): ");
		int edic = sc.nextInt();
		rev1.setEdicion(edic);
		System.out.println("Seleccione una opcion de periodicidad: \n1.Diaria  \n2.Semanal \n3.Mensual");
		int per = sc.nextInt();
		rev1.setPeriodicidad(per);
		System.out.println("------------------Ingresando datos de Artículo Científico----------------");
		rut = 3;
		ingreso(rut, lib1, rev1, art1);
		System.out.println("Ingrese el estado de revisión del artículo");
		String revi = sc.next();
		art1.setRevision(revi);
		System.out.println("Ingrese la materia del artículo");
		String mat = sc.next();
		art1.setMateria(mat);
		System.out.println("------------------Mostrando datos de Libro----------------");
		System.out.println("Autor / Título / Editorial / Género\n" + lib1.getAutor() + " / " + lib1.getTitulo() + " / "
				+ lib1.getEditorial() + " / " + lib1.getGenero());
		System.out.println("------------------Mostrando datos de Revista----------------");
		String perio = null;
		if (rev1.getPeriodicidad() == 1) {
			perio = "Diario";
		} else if (rev1.getPeriodicidad() == 2) {
			perio = "Semanal";
		} else {
			perio = "Mensual";
		}
		System.out.println("Autor / Título / Edición / Periodicidad\n" + rev1.getAutor() + " / " + rev1.getTitulo()
				+ " / " + rev1.getEdicion() + " / " + perio);
		System.out.println("------------------Mostrando datos de Artículo Científico----------------");
		System.out.println("Autor / Título / Revición / Materia\n" + art1.getAutor() + " / " + art1.getTitulo() + " / "
				+ art1.getRevision() + " / " + art1.getMateria());

	}

	public static void ingreso(int ruta, Libro l, Revista r, ArtículoCientífico AC) {
		// +DC
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del autor (use ¨_¨ en vez de espacios): ");
		String nom = sc.next();
		System.out.println("Ingrese el título");
		String titu = sc.next();
		if (ruta == 1) {
			l.setAutor(nom);
			l.setTitulo(titu);
		} else if (ruta == 2) {
			r.setAutor(nom);
			r.setTitulo(titu);
		} else {
			AC.setAutor(nom);
			AC.setTitulo(titu);
		}

	}
	public static void Mostrarart(ArtículoCientífico art) {
		
	}

}
