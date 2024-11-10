package clases;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

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
		File audioFile = new File(this.getRutaSonido());

        AudioInputStream audioStream = null;
        
		try {
			audioStream = AudioSystem.getAudioInputStream(audioFile);
		} catch (UnsupportedAudioFileException | IOException e) {
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
	}
	
}

