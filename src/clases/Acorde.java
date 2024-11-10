package clases;

import java.util.List;

public class Acorde extends Nota{
	private List<Nota> notas;
	
	public Acorde(String id, List<Nota> notas, String nombre, String rutaSonido){
		super(nombre, rutaSonido, id);
		this.notas = notas;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
}

