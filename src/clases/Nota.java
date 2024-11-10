package clases;

import java.io.File;
import java.io.IOException;
import java.nio.channels.UnsupportedAddressTypeException;

import android.content.Context;
import android.content.res.AssetManager.AssetInputStream;
import android.media.MediaPlayer;
import android.net.Uri;

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
	
	public void reproducirAudio(Context context){
		 File audioFile = new File(this.getRutaSonido());

		    if (audioFile.exists()) {
		        Uri uri = Uri.fromFile(audioFile);
		        MediaPlayer mediaPlayer = MediaPlayer.create(context, uri);

		        if (mediaPlayer != null) {
		            // Usando una clase anónima en lugar de la lambda
		            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
		                @Override
		                public void onCompletion(MediaPlayer mp) {
		                    mp.release(); // Libera el MediaPlayer cuando termine la reproducción
		                }
		            });
		            mediaPlayer.start();
		        } else {
		            System.out.println("Error al inicializar el MediaPlayer.");
		        }
		    } else {
		        System.out.println("El archivo de audio no existe.");
		    }
	}
	
}

