package edu.curso.java.ejemplolog4j;

import java.io.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GestorDeArchivos {

	private final static Logger log = LogManager.getLogger(GestorDeArchivos.class);
	
	public void guardarArchivo(String ruta, String texto) throws GestorDeArchivosException {
		log.debug("guardando un nuevo archivo: " + ruta);
		File miArchivo = new File(ruta);
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter(miArchivo);
			fileWriter.write(texto);
		} catch (IOException e) {
			log.error("Error al guardar el archivo", e);
			throw new GestorDeArchivosException("No pudimos guardar tu archivo", e);
		} finally {
			System.out.println("Ejecutando finally....");
			try {
				if(fileWriter != null)
					fileWriter.close();
			} catch (IOException e) {}
		}
	}
}
