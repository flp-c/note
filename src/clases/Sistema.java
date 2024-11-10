package clases;

import java.util.List;

public class Sistema extends ISistema{
	
	private Nota notaActual;
	private Usuario usuarioActual;
	private List<Usuario> usuarios;
	
	private List<Nota> solfeo;
	
	public void iniciarSolfeo(){
		Nota C = new Nota("C", "", "1");
		Nota Cs = new Nota("C#", "", "2");
		Nota D = new Nota("D", "", "3");
		Nota Ds = new Nota("D#", "", "4");
		Nota E = new Nota("E", "", "5");
		Nota F = new Nota("F", "", "6");
		Nota Fs = new Nota("F#", "", "7");
		Nota G = new Nota("G", "", "8");
		Nota Gs = new Nota("G#", "", "9");
		Nota A = new Nota("A", "", "10");
		Nota As = new Nota("A#", "", "11");
		Nota B = new Nota("B", "", "12");
		
		this.solfeo.add(C);
		this.solfeo.add(Cs);
		this.solfeo.add(D);
		this.solfeo.add(Ds);
		this.solfeo.add(E);
		this.solfeo.add(F);
		this.solfeo.add(Fs);
		this.solfeo.add(G);
		this.solfeo.add(Gs);
		this.solfeo.add(A);
		this.solfeo.add(As);
		this.solfeo.add(B);
		
	}
	
	public boolean esNota(String id, Usuario user){
		if (this.notaActual.getId() == id){
			user.setRacha(user.getRacha() + 1);
			return true;
		}
		return false;
	}
	
	public boolean registrarUsuario(String nombre, String apellido, String mail, String contraseña, DTFecha fechaNac) {
		/*if(nombre.isEmpty() || ){
			
		}*/
		
		
		
		return false;
		
	}
	
	
}

