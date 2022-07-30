package cl.fsj.infoclub;


public class Utilidad {
	public void limpiarConsola(){
		for(int i = 0; i<50; i++) {
			System.out.println("\n");
		}
	}

	
	public Utilidad() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void delay(int mils) {
		try {
			Thread.sleep(mils); 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
