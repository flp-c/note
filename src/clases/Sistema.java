package clases;

public class Sistema extends ISistema{
	
	private Nota notaActual;
	
	public boolean esNota(String id){
		return (this.notaActual.getId() == id);
	}
	
	
	
}

