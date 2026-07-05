package No_me_gusta_el_arte;

import java.util.Scanner;

import Bob_Destruye.Apartamento;
import Bob_Destruye.Casa;

public class Controladora {

	public static void main(String[] args) {
		//fuck arte, 
		Scanner sc=new Scanner(System.in);
		Pintura arrPin[]=new Pintura[10];
		Fotografia arrFot[]=new Fotografia[10];
		Escultura arrEsc[]=new Escultura[10];
		int op = 0;
		while (op != 5) {
			switch (op) {
			case 0:
				System.out.println(
						"Bienvenido al gestor del museo\n1-Alta de una obra\n2-Listar obras \n3-Dar de baja una obra \n4-Cambiar dato de una obra\n5-Salir");
				op = sc.nextInt();
				break;

			case 1:
				System.out.println("Seleccione que tipo de obra quiera agregar: \n1.Pintura \n2.Fotografía \n3.Escultura");
				int case1Op = sc.nextInt();

				if (case1Op == 1) {
					System.out.println(
							"-------------Ingresando datos de la pintura--------------\nIngrese el nombre del autor (Utilize '_' en vez de espacios): ");
					String n = sc.next();
					System.out.println("Ingrese el título (Utilize '_' en vez de espacios):");
					String cd = sc.next();
					System.out.println("Ingrese el nombre de la técnica (Utilize '_' en vez de espacios): ");
					String pp = sc.next();
					System.out.println("Ingrese el nombre del estilo (Utilize '_' en vez de espacios):");
					String p = sc.next();
					altaPin(arrPin, n, cd, pp, p);

				} else if (case1Op == 2) {
						System.out.println(
								"-------------Ingresando datos de la fotografía--------------\nIngrese el nombre del autor (Utilize '_' en vez de espacios): ");
						String n = sc.next();
						System.out.println("Ingrese el título (Utilize '_' en vez de espacios):");
						String cd = sc.next();
						System.out.println("Ingrese el nombre del plano (Utilize '_' en vez de espacios): ");
						String pp = sc.next();
						System.out.println("Ingrese el nombre del modelo de la cámara (Utilize '_' en vez de espacios):");
						String p = sc.next();
						altaFot(arrFot, n, cd, pp, p);
				} else if (case1Op == 3) {
					System.out.println(
							"-------------Ingresando datos de la escultura--------------\nIngrese el nombre del autor (Utilize '_' en vez de espacios): ");
					String n = sc.next();
					System.out.println("Ingrese el título (Utilize '_' en vez de espacios):");
					String cd = sc.next();
					System.out.println("Ingrese el nombre del material (Utilize '_' en vez de espacios): ");
					String pp = sc.next();
					System.out.println("Ingrese la altura de la escultura:");
					double p = sc.nextDouble();
					altaEsc(arrEsc, n, cd, pp, p);
			}
				op = 0;
				break;
				

			case 2:
				System.out.println("Pinturas: \nID / Autor / Título / Técnica / Estilo");
				listarPin(arrPin);
				System.out.println("\n----------------------------------------------------");
				System.out.println("Fotografías: \nID / Autor / Título / Plano / Modelo de la cámara");
				listarFot(arrFot);
				System.out.println("\n----------------------------------------------------");
				System.out.println("Esculturas: \nID / Autor / Título / Material / Altura");
				listarEsc(arrEsc);
				System.out.println("\n----------------------------------------------------");
				op = 0;
				break;

			case 3:
				System.out.println(
						"Baja de obras \nIndique el tipo de obra que desea eliminar: \n1.Pintura \n2.Fotografía \n3.Escultura \nSeleccione cualquier otro valor para salir");
				int case3Op = sc.nextInt();
				if (case3Op == 1) {
					System.out.println("Ingrese el ID de la obra: ");
					int id = sc.nextInt();
					bajaPin(id, arrPin);
				}
				if (case3Op == 2) {
					System.out.println("Ingrese el ID de la obra: ");
					int id = sc.nextInt();
					bajaFot(id, arrFot);
				}
				if (case3Op == 3) {
					System.out.println("Ingrese el ID de la obra: ");
					int id = sc.nextInt();
					bajaEsc(id, arrEsc);
				}
				System.out.println("\n");

				op = 0;
				break;

			case 4:
				System.out.println(
						"Cambiar valor de Atributo de una obra\nIngrese el tipo de obra que quiera modificar: \n1.Pintura \n2.Fotografia \n3.Escultura");
				int case4Op = sc.nextInt();
				System.out.println("Ingrese el id de la obra");
				int id = sc.nextInt();
				if (case4Op == 1) {
					modificarPin(id, arrPin);
				}
				if (case4Op == 2) {
					modificarFot(id, arrFot);
				}
				if (case4Op == 3) {
					modificarEsc(id, arrEsc);
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

	public static void altaPin(Pintura[] a, String p, String n, String v, String m) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print("");

			} else {
				if (a[i] == null) {
					int nId = i;
					a[i] = new Pintura(p, n, nId, v, m);
					System.out.println("ID: " + i);
					System.out.println("Obra guardada\n");
					break;
				}

			}
		}

	}

	public static void altaFot(Fotografia[] a, String p, String n, String v, String m) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print("");

			} else {
				if (a[i] == null) {
					int nId = i;
					a[i] = new Fotografia(p, n, nId, v, m);
					System.out.println("ID: " + i);
					System.out.println("Obra guardada\n");
					break;
				}

			}
		}

	}

	public static void altaEsc(Escultura[] a, String p, String n, String v, double m) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print("");

			} else {
				if (a[i] == null) {
					int nId = i;
					a[i] = new Escultura(p, n, nId, v, m);
					System.out.println("ID: " + i);
					System.out.println("Obra guardada\n");
					break;
				}

			}
		}

	}

	public static void listarPin(Pintura[] ar) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {

				System.out.println(ar[i].getId() + " / " + ar[i].getAutor() + " / " + ar[i].getTitulo() + " / "
						+ ar[i].getTecnica() + " / " + ar[i].getEstilo());

			}

		}

	}

	public static void listarFot(Fotografia[] ar) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {

				System.out.println(ar[i].getId() + " / " + ar[i].getAutor() + " / " + ar[i].getTitulo() + " / "
						+ ar[i].getPlano() + " / " + ar[i].getNombreCamara());

			}

		}

	}
	public static void listarEsc(Escultura[] ar) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {

				System.out.println(ar[i].getId() + " / " + ar[i].getAutor() + " / " + ar[i].getTitulo() + " / "
						+ ar[i].getMaterial() + " / " + ar[i].getAltura());

			}

		}

	}


	public static void bajaPin(int id, Pintura[] arg) {
		boolean com = false;

		for (int i = 0; i < arg.length; i++) {

			if (arg[i] != null && arg[i].getId() == id) {
				arg[i] = null;
				System.out.println("Obra eliminada\n");
				com = true;
				i=999999;
				break;
			}
		}
		if (com == false) {
			System.out.println("Obra no encontrada\n");
		}

	}

	public static void bajaEsc(int id, Escultura[] arg) {
		boolean com = false;

		for (int i = 0; i < arg.length; i++) {

			if (arg[i] != null && arg[i].getId() == id) {
				arg[i] = null;
				System.out.println("Obra eliminada\n");
				com = true;
				i=999999;
				break;
			}
		}
		if (com == false) {
			System.out.println("Obra no encontrada\n");
		}

	}
	public static void bajaFot(int id, Fotografia[] arg) {
		boolean com = false;

		for (int i = 0; i < arg.length; i++) {

			if (arg[i] != null && arg[i].getId() == id) {
				arg[i] = null;
				System.out.println("Obra eliminada\n");
				com = true;
				i=99999;
				break;
			}
		}
		if (com == false) {
			System.out.println("Obra no encontrada\n");
		}

	}

	public static void modificarPin(int id, Pintura [] arge) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arge.length; i++) {

			if (arge[i] != null && arge[i].getId() == id) {

				System.out.println(
						"Seleccione el atributo que quiera modificar: \n1.Autor \n2.Título  \n3.Técnica \n4.Estilo");
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

					System.out.println("Cambiando técnica \nIngrese la técnica deseada: ");
					String cd = sc.next();
					arge[i].setTecnica(cd);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 4) {
					System.out.println("Cambiando estilo \nIngrese el estilo deseado: ");
					String cd = sc.next();
					arge[i].setEstilo(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi < 1 || oi > 4) {
					System.out.println("Seleccione una opcion correcta\n");
					break;
				}
			} else {
				System.out.println("Espacio comprobado...");
			}

		}
	}

	public static void modificarFot(int id, Fotografia [] arge) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arge.length; i++) {

			if (arge[i] != null && arge[i].getId() == id) {

				System.out.println(
						"Seleccione el atributo que quiera modificar: \n1.Autor \n2.Título  \n3.Plano \n4.Modelo de la cámara");
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

					System.out.println("Cambiando plano \nIngrese el plano deseado: ");
					String cd = sc.next();
					arge[i].setPlano(cd);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 4) {
					System.out.println("Cambiando modelo de la cámara \nIngrese el modelo deseado: ");
					String cd = sc.next();
					arge[i].setNombreCamara(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi < 1 || oi > 4) {
					System.out.println("Seleccione una opcion correcta\n");
					break;
				}
			} else {
				System.out.println("Espacio comprobado...");
			}

		}
		
	}
	public static void modificarEsc(int id, Escultura [] arge) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arge.length; i++) {

			if (arge[i] != null && arge[i].getId() == id) {

				System.out.println(
						"Seleccione el atributo que quiera modificar: \n1.Autor \n2.Título  \n3.Material \n4.Altura");
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

					System.out.println("Cambiando Material \nIngrese técnica deseada: ");
					String cd = sc.next();
					arge[i].setMaterial(cd);
					System.out.println("Dato cambiado\n");
					break;
				}
				if (oi == 4) {
					System.out.println("Cambiando altura \nIngrese la altura deseada: ");
					double cd = sc.nextDouble();
					arge[i].setAltura(cd);
					System.out.println("Dato cambiado\n");
					break;
				}

				if (oi < 1 || oi > 4) {
					System.out.println("Seleccione una opcion correcta\n");
					break;
				}
			} else {
				System.out.println("Espacio comprobado...");
			}

		}
	}
}
