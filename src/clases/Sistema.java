package clases;

public class Sistema extends ISistema{
	
	private Nota notaActual;
	
	public boolean esNota(Nota n){
		return ((this.notaActual.getAlteracion() == n.getAlteracion()) && (this.notaActual.getLetra() == n.getLetra()));
	}
	
	
	
}

