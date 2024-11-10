package clases;

public abstract class ISistema {
	
	public abstract boolean esNota(String id);
	public abstract boolean registrarUsuario(String nombre, String apellido, String mail, String contraseña, DTFecha fechaNac);
}