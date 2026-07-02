package MundoAcademico;

import java.util.Scanner;

public class gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Libro arrLib[] = new Libro[10];
		Revista arrRev[] = new Revista[10];
		ArtículoCientífico arrArt[] = new ArtículoCientífico[10];
		int op = 0;
		while (op != 5) {
			switch (op) {
			case 0:
				System.out.println(
						"Bienvenido al gestor del noticiero\n1-Alta de una publicación\n2-Listar publicaciones \n3-Dar de baja una publicación \n4-Cambiar dato de una publicación\n5-Salir");
				op = sc.nextInt();
				break;

			case 1:
				System.out.println(
						"Seleccione que tipo de producto quiere agregar: \n1.Libro \n2.Revista \n3.Atrículo científico");
				int case1Op = sc.nextInt();

				if (case1Op == 1) {
					System.out.println(
							"-------------Ingresando datos del libro--------------\nIngrese el nombre del autor del libro (Utilize '_' en vez de espacios): ");
					String autor = sc.next();
					System.out.println("Ingrese el título del libro (Utilize '_' en vez de espacios):");
					String titulo = sc.next();
					System.out
							.println("Ingrese el nombre de la editorial del libro (Utilize '_' en vez de espacios): ");
					String ed = sc.next();
					System.out.println("Ingrese el género del libro (Utilize '_' en vez de espacios):");
					String genero = sc.next();
					altaLib(arrLib, autor, titulo, ed, genero);

				} else if (case1Op == 2) {
					System.out.println(
							"-------------Ingresando datos de la revista--------------\nIngrese el nombre del autor de la revista (Utilize '_' en vez de espacios): ");
					String autor = sc.next();
					System.out.println("Ingrese el título de la revista (Utilize '_' en vez de espacios):");
					String titulo = sc.next();
					System.out.println(
							"Indique la periodicidad de la revista: \n1.Diaria \n2.Semanal \n3.Mensual \n4.Anual");
					int per = sc.nextInt();
					System.out.println("Ingrese el número de la edición de la revista:");
					int edic = sc.nextInt();
					altaRev(arrRev, autor, titulo, per, edic);

				} else if (case1Op == 3) {
					System.out.println(
							"-------------Ingresando datos del artículo científico--------------\nIngrese el nombre del autor del artículo (Utilize '_' en vez de espacios): ");
					String autor = sc.next();
					System.out.println("Ingrese el título del artículo (Utilize '_' en vez de espacios):");
					String titulo = sc.next();
					System.out.println("Ingrese el estado de revisión del artículo: ");
					String per = sc.next();
					System.out.println("Ingrese la materia del artículo:");
					String edic = sc.next();
					altaArt(arrArt, autor, titulo, per, edic);

				}
				op = 0;
				break;

			case 2:
				System.out.println("Libros: \nID / Autor / Título / Editorial / Género");
				listarLib(arrLib);
				System.out.println("----------------------------------------------------");
				System.out.println("Revistas: \nID / Autor / Título / Periodicidad / Edición");
				listarRev(arrRev);
				System.out.println("----------------------------------------------------");
				System.out.println("Artículos científicos: \nID / Autor / Título / Estado de revisión / Materia");
				listarArt(arrArt);
				System.out.println("----------------------------------------------------");
				op = 0;
				break;

			case 3:
				System.out.println(
						"Baja de publicaciones \nEscriba el tipo de Publicación que desea eliminar: \n1.Libro \n2.Revista \n3.Artículo científico \nSeleccione cualquier otro valor para salir");
				int case3Op = sc.nextInt();
				if (case3Op == 1) {
					System.out.println("Ingrese el ID de la publicación: ");
					int id = sc.nextInt();
					bajaLib(id, arrLib);
				}
				if (case3Op == 2) {
					System.out.println("Ingrese el ID de la publicación: ");
					int id = sc.nextInt();
					bajaRev(id, arrRev);
				}
				if (case3Op == 3) {
					System.out.println("Ingrese el ID del publicación: ");
					int id = sc.nextInt();
					bajaArt(id, arrArt);
				}

				op = 0;
				break;

			case 4:
				System.out.println(
						"Cambiar valor de Atributo de una publicación\nIngrese el tipo de publicación que quiera modificar: \n1.Libro \n2.Revista \n3.Artículo científico");
				int case4Op = sc.nextInt();
				if (case4Op == 1) {
					System.out.println("Ingrese el id de la publicación");
					int id = sc.nextInt();
					modificarLib(id, arrLib);
				}
				if (case4Op == 2) {
					System.out.println("Ingrese el id del publicación");
					int id = sc.nextInt();
					modificarRev(id, arrRev);
				}
				if (case4Op == 3) {
					System.out.println("Ingrese el id del publicación");
					int id = sc.nextInt();
					modificarArt(id, arrArt);
				}
				if (case4Op < 1 || case4Op > 3) {
					System.out.println("Opción inexistente\n");
				}
				op = 0;
				break;

			default:
				System.out.println("Por acá no es");
				op = 0;
				break;

			}
		}
		System.out.println("Gracias por usar nuestro programa!");
	}

	public static void altaLib(Libro[] a, String p, String n, String v, String m) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print("");

			} else {
				if (a[i] == null) {
					int nId = i;
					a[i] = new Libro(p, n, nId, v, m);
					System.out.println("ID: " + i);
					System.out.println("Libro guardado\n");
					break;
				}

			}
		}

	}

	public static void altaRev(Revista[] a, String p, String n, int t, int e) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print("");

			} else {
				if (a[i] == null) {
					int nId = i;
					a[i] = new Revista(p, n, nId, t, e);
					System.out.println("ID: " + i);
					System.out.println("Revista guardada\n");
					break;
				}

			}
		}

	}

	public static void altaArt(ArtículoCientífico[] a, String p, String n, String t, String c) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print("");

			} else {
				if (a[i] == null) {
					int nId = i;
					a[i] = new ArtículoCientífico(p, n, nId, t, c);
					System.out.println("ID: " + i);
					System.out.println("Artículo guardado\n");
					break;
				}

			}
		}

	}

	public static void listarLib(Libro[] ar) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {

				System.out.print(ar[i].getId() + " / " + ar[i].getAutor() + " / " + ar[i].getTitulo() + " / "
						+ ar[i].getEditorial() + " / " + ar[i].getGenero() + "\n");

			}

		}

	}

	public static void listarArt(ArtículoCientífico[] ar) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {

				System.out.println(ar[i].getId() + " / " + ar[i].getAutor() + " / " + ar[i].getTitulo() + " / "
						+ ar[i].getRevision() + " / " + ar[i].getMateria());

			}

		}

	}

	public static void listarRev(Revista[] ar) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {

				System.out.print(ar[i].getId() + " / " + ar[i].getAutor() + " / " + ar[i].getTitulo() + " / ");
				if (ar[i].getPeriodicidad() == 1) {
					System.out.print("Diaria");
				} else if (ar[i].getPeriodicidad() == 2) {
					System.out.print("Semanal");
				} else if (ar[i].getPeriodicidad() == 3) {
					System.out.print("Mensual");
				} else {
					System.out.print("Anual");
				}
				System.out.println(" / " + ar[i].getEdicion());

			}

		}

	}

	public static void bajaLib(int id, Libro[] arg) {
		boolean com = false;

		for (int i = 0; i < arg.length; i++) {

			if (arg[i] != null && arg[i].getId() == id) {
				arg[i] = null;
				System.out.println("Publicación eliminada\n");
				com = true;
				break;
			}
		}
		if (com == false) {
			System.out.println("Producto no encontrado\n");
		}

	}

	public static void bajaRev(int id, Revista[] arg) {
		boolean com = false;

		for (int i = 0; i < arg.length; i++) {

			if (arg[i] != null && arg[i].getId() == id) {
				arg[i] = null;
				System.out.println("Publicación eliminada\n");
				com = true;
				break;
			}
		}
		if (com == false) {
			System.out.println("Producto no encontrado\n");
		}

	}

	public static void bajaArt(int id, ArtículoCientífico[] arg) {
		boolean com = false;

		for (int i = 0; i < arg.length; i++) {

			if (arg[i] != null && arg[i].getId() == id) {
				arg[i] = null;
				System.out.println("Publicación eliminada\n");
				com = true;
				break;
			}
		}
		if (com == false) {
			System.out.println("Producto no encontrado\n");
		}

	}

	public static void modificarLib(int id, Libro[] arge) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arge.length; i++) {

			if (arge[i] != null && arge[i].getId() == id) {

				System.out.println(
						"Seleccione el atributo que quiera modificar: \n1.Autor \n2.Título  \n3.Editorial \n4.Género");
				int oi = sc.nextInt();

				if (oi == 1) {

					System.out.println("Cambiando autor \nIngrese el autor deseado: ");
					String cd = sc.next();
					arge[i].setAutor(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi == 2) {
					System.out.println("Cambiando título \nIngrese el título deseado: ");
					String mar = sc.next();
					arge[i].setTitulo(mar);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 3) {

					System.out.println("Cambiando editorial \nIngrese la editorial deseada: ");
					String cd = sc.next();
					arge[i].setEditorial(cd);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 4) {
					System.out.println("Cambiando género \nIngrese el género deseado: ");
					String cd = sc.next();
					arge[i].setGenero(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi < 1 || oi > 4) {
					System.out.println("Seleccione una opcion correcta\n");
					break;
				}
			} else {
				System.out.println("Espacio comprobado");
			}

		}
	}

	public static void modificarRev(int id, Revista[] arge) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arge.length; i++) {

			if (arge[i] != null && arge[i].getId() == id) {

				System.out.println(
						"Seleccione el atributo que quiera modificar: \n1.Autor \n2.Título  \n3.Periodicidad \n4.Edición");
				int oi = sc.nextInt();

				if (oi == 1) {

					System.out.println("Cambiando autor \nIngrese el autor deseado: ");
					String cd = sc.next();
					arge[i].setAutor(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi == 2) {
					System.out.println("Cambiando título \nIngrese el título deseado: ");
					String mar = sc.next();
					arge[i].setTitulo(mar);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 3) {

					System.out.println(
							"Cambiando periodicidad \nInserte la periodicidad deseada: \n1.diaria \n2.Semanal \n3.Mensual \n4.Anual");
					int cd = sc.nextInt();
					arge[i].setPeriodicidad(cd);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 4) {
					System.out.println("Cambiando género \nIngrese el género deseado: ");
					int cd = sc.nextInt();
					arge[i].setEdicion(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi < 1 || oi > 4) {
					System.out.println("Seleccione una opcion correcta\n");
					break;
				}
			} else {
				System.out.println("Espacio comprobado");
			}

		}
	}

	public static void modificarArt(int id, ArtículoCientífico[] arge) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arge.length; i++) {

			if (arge[i] != null && arge[i].getId() == id) {

				System.out.println(
						"Seleccione el atributo que quiera modificar: \n1.Autor \n2.Título  \n3.Estado de revisión \n4.Materia");
				int oi = sc.nextInt();

				if (oi == 1) {

					System.out.println("Cambiando autor \nIngrese el autor deseado: ");
					String cd = sc.next();
					arge[i].setAutor(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi == 2) {
					System.out.println("Cambiando título \nIngrese el título deseado: ");
					String mar = sc.next();
					arge[i].setTitulo(mar);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 3) {

					System.out.println("Cambiando estado de revisión \nIngrese el estado de revisión deseado: ");
					String cd = sc.next();
					arge[i].setRevision(cd);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 4) {
					System.out.println("Cambiando materia \nIngrese la materia deseada: ");
					String cd = sc.next();
					arge[i].setMateria(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi < 1 || oi > 4) {
					System.out.println("Seleccione una opcion correcta\n");
					break;
				}
			} else {
				System.out.println("Espacio comprobado");
			}

		}
	}

}
