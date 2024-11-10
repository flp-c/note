package clases;

import java.util.List;

public class Acorde {
	private String id;
	private String nombre;
	private List<Nota> notas;
	
	public Acorde(List<Nota> notas, String nombre, String id){
		this.id = id;
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

