package clases;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Nota {
	private char letra;
	private boolean alteracion;
	private String rutaSonido;
	
	public Nota(char letra, boolean alteracion, String rutaSonido) {
		this.letra = letra;
		this.alteracion = alteracion;
		this.rutaSonido = rutaSonido;
	}
	
	public char getLetra() {
		return this.letra;
	}
	
	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	public boolean getAlteracion() {
		return this.alteracion;
	}
	
	public void setAlteracion(boolean alteracion) {
		this.alteracion = alteracion;
	}
	
	public String getRutaSonido() {
		return this.rutaSonido;
	}
	
	public void setRutaSonido(String rutaSonido) {
		this.rutaSonido = rutaSonido;
	}
	
	public void reproducirNota(){
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

