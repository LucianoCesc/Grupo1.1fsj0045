package cl.fsj.infoclub;

import java.util.ArrayList;

public class ProductoServicio {
	ArrayList<Producto> listaProductos = new ArrayList<>();

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public void listarProductos() {
		for (Producto p: listaProductos) {
			
			System.out.println();
			System.out.println("---------------------------------\n");
			System.out.println("Nombre articulo: "+p.getArticulo());
			System.out.println("Codigo: "+p.getCodigo());
			System.out.println("Marca: "+p.getMarca());
			System.out.println("Color: "+p.getColor());
			System.out.println("Descripcion: "+p.getDescripcion());
			System.out.println("Precio: "+p.getPrecio());
			System.out.println("Talla: "+p.getTalla());
			System.out.println("---------------------------------\n");
		}
	}
	
	public void agregarProductos(Producto p) {
		this.listaProductos.add(p);
	}

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

	public ProductoServicio() {
		super();
	}
	
	
}
