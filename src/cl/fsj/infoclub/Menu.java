package cl.fsj.infoclub;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArchivoServicio as = new ArchivoServicio();
		ProductoServicio ps = new ProductoServicio();
		Utilidad ut = new Utilidad();
		int op=0;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		boolean end=false;
		
		while(!end) {
			do {
				System.out.println("1 Listar Productos");
				System.out.println("2 Editar Datos");
				System.out.println("3 Importar Datos");
				System.out.println("4 Salir");
				System.out.println("********************************");
				System.out.println("Ingrese una alternativa:");
				op=sc.nextInt();
			}while(op<1 || op>4);

			if (op==1) {
				if (!ps.listaProductos.isEmpty()) {
					for (Producto p : ps.listaProductos) {
						System.out.println();
						System.out.println("------------------------------\n");
						System.out.println("Nombre articulo: "+p.getArticulo());
						System.out.println("Codigo: "+p.getCodigo());
						System.out.println("Marca: "+p.getMarca());
						System.out.println("Color: "+p.getColor());
						System.out.println("Descripcion: "+p.getDescripcion());
						System.out.println("Precio: "+p.getPrecio());
						System.out.println("Talla: "+p.getTalla());
						System.out.println("---------------------------------\n");
					}
				}else {
					System.out.println("La lista de productos esta vacia.");
				}
			}
			
			if (op==2) {
				if (!ps.listaProductos.isEmpty()) {
					int op2=-1;
					do {
						System.out.println("Editar Producto");
						System.out.println("Ingrese la opcion 1 para editar los datos ingresados del Producto,\r\n"
								+ "0 para cancelar:");
						op2=sc.nextInt();
						
					}while(op2<0 || op2>1);
					
					if (op2==1) {
						System.out.println("Ingrese codigo del producto:");
						String cod=sc2.nextLine();
						int h=0;
						
						for (int i=0;i<ps.listaProductos.size();i++) {
							Producto p = ps.listaProductos.get(i);
							
							if (p.getCodigo().equals(cod)) {
								h=i;
							}
						}
						
						Producto p = ps.listaProductos.get(h);
						
						System.out.println();
						System.out.println("---------------------------------\n");
						System.out.println("1. Nombre articulo: "+p.getArticulo());
						System.out.println("2. Codigo: "+p.getCodigo());
						System.out.println("3. Marca: "+p.getMarca());
						System.out.println("4. Color: "+p.getColor());
						System.out.println("5. Descripcion: "+p.getDescripcion());
						System.out.println("6. Precio: "+p.getPrecio());
						System.out.println("7. Talla: "+p.getTalla());
						System.out.println("---------------------------------\n");

						
						int op3=0;

						do {
							System.out.println("Ingrese la opcion (De 1 a 7) para modificar el producto:");
							op3=sc.nextInt();
							
						}while(op3<1 || op3>7);
							String inp="";
			
							if (op3==1) {
								System.out.println("Ingrese el nuevo Nombre de Articulo:");
								inp=sc2.nextLine();
								p.setArticulo(inp);
							}
							
							if (op3==2) {
								System.out.println("Ingrese el nuevo Codigo:");
								inp=sc2.nextLine();
								p.setCodigo(inp);
							}
							
							if (op3==3) {
								System.out.println("Ingrese la nueva Marca");
								inp=sc2.nextLine();
								p.setMarca(inp);
							}
							
							if (op3==4) {
								System.out.println("Ingrese el nuevo Color");
								inp=sc2.nextLine();
								p.setColor(inp);
							}
							
							if (op3==5) {
								System.out.println("Ingrese la nueva Descripcion");
								inp=sc2.nextLine();
								p.setDescripcion(inp);
							}
							
							if (op3==6) {
								System.out.println("Ingrese el nuevo Precio");
								inp=sc2.nextLine();
								p.setPrecio(inp);	
							}
							
							if (op3==7) {
								System.out.println("Ingrese la nueva Talla");
								inp=sc2.nextLine();
								p.setTalla(inp);
							}
						
							System.out.println();
							System.out.println("---------------------------------\n");
							System.out.println("1. Nombre articulo: "+p.getArticulo());
							System.out.println("2. Codigo: "+p.getCodigo());
							System.out.println("3. Marca: "+p.getMarca());
							System.out.println("4. Color: "+p.getColor());
							System.out.println("5. Descripcion: "+p.getDescripcion());
							System.out.println("6. Precio: "+p.getPrecio());
							System.out.println("7. Talla: "+p.getTalla());
							System.out.println("---------------------------------\n");

					}else if (op2==0){
						System.out.println("Se cancela la operacion.");
						System.out.println("");
						System.out.println("");
						
					}
				}else {
					System.out.println("La lista de productos esta vacia.");
				}
			}
			
			if (op==3) {
				System.out.println("Cargar Datos");
				System.out.print("Ingresa la ruta en donde se encuentra el archivo ");
				System.out.println("\"ProductosImportados.csv\":");
				String ruta = sc2.nextLine();
				as.cargarDatos("src/"+ruta+"/ProductosImportados.csv", ps.listaProductos);
				//System.out.println(ps.listaProductos);
				for (Producto p : ps.listaProductos) {
					System.out.println(p.toString());
				}
				System.out.println("Datos cargados correctamente en la lista.");
			}
			
			if (op==4) {
				ut.limpiarConsola();
		        System.out.println("Abandonando el sistema de productos...");
		        ut.delay(1000);
		        System.out.println("Acaba de salir del sistema.");
		        ut.delay(1000);
		        ut.limpiarConsola();
		        end = true;
			}
			
			op=0;
		}
		
		sc.close();
		sc2.close();
	}

}
