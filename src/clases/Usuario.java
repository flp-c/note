package clases;

public class Usuario{
	String id;
	String nombre;
	String apellido;
	String mail;
	String contraseña;
	DTFecha fechaNac;
	int racha;
	
	public Usuario(String id, String nombre, String apellido, String mail, String contraseña, DTFecha fechaNac) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.contraseña = contraseña;
		this.fechaNac = fechaNac;
		this.racha = 0;
	}

	public String getId() {
		return nombre;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public DTFecha getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(DTFecha fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getRacha() {
		return racha;
	}

	public void setRacha(int racha) {
		this.racha = racha;
	}
	
	
	
}