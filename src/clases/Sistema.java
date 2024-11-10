package clases;

import java.util.List;

public class Sistema extends ISistema{
	
	private Nota notaActual;
	private Usuario usuarioActual;
	private List<Usuario> usuarios;
	
	public boolean esNota(String id){
		return (this.notaActual.getId() == id);
	}
	
	public boolean registrarUsuario(String nombre, String apellido, String mail, String contraseña, DTFecha fechaNac) {
		/*if(nombre.isEmpty() || ){
			
		}*/
		
		
		
		return false;
		
	}
	
	
}

