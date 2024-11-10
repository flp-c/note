package clases;

import java.io.File;
import java.io.IOException;
import java.nio.channels.UnsupportedAddressTypeException;

import android.content.res.AssetManager.AssetInputStream;

public class Nota {
	private String id;
	private String nombre;
	private String rutaSonido;
	
	public Nota(String nombre, String rutaSonido, String id) {
		this.nombre = nombre;
		this.rutaSonido = rutaSonido;
		this.id = id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setLetra(String nombre) {
		this.nombre = nombre;
	}
	
	public String getRutaSonido() {
		return this.rutaSonido;
	}
	
	public void setRutaSonido(String rutaSonido) {
		this.rutaSonido = rutaSonido;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void reproducirAudio(){
		/*File audioFile = new File(this.getRutaSonido());

        AssetInputStream audioStream = null;
        
		try {
			audioStream = AudioSystem.getAudioInputStream(audioFile);
		} catch (UnsupportedAddressTypeException | IOException e) {
			e.printStackTrace();
		}
		
        Clip clip = null;
        
		try {
			clip = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        try {
			clip.open(audioStream);
		} catch (LineUnavailableException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	
}

