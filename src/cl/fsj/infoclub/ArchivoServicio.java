package cl.fsj.infoclub;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoServicio {
	
	
	public ArchivoServicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void cargarDatos(String dir,ArrayList<Producto> l){
		String csvFile = dir;
		BufferedReader br = null;
		String line = "";
		//Se define separador ","
		String cvsSplitBy = ",";
		try {
		    br = new BufferedReader(new FileReader(csvFile));
		    while ((line = br.readLine()) != null) {                
		        String[] datos = line.split(cvsSplitBy);
		        //Imprime datos.
		        
		        Producto pr = new Producto();
		        pr.setArticulo(datos[0]);
		        pr.setPrecio(datos[1]);
		        pr.setDescripcion(datos[2]);
		        pr.setCodigo(datos[3]);
		        pr.setTalla(datos[4]);
		        pr.setMarca(datos[5]);
		        pr.setColor(datos[6]);

		        l.add(pr);
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    if (br != null) {
		        try {
		            br.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}

	}
}
