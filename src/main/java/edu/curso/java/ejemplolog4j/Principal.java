package edu.curso.java.ejemplolog4j;

import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Principal {

	private final static Logger log = LogManager.getLogger(Principal.class);
	
	public static void main(String[] args) {
		log.info("Inicio del programa: " + new Date());

		// TODO Auto-generated method stub
		log.debug("Ejemplo de debug......");

		try {
			String texto = null;
			String textoUpper = texto.toUpperCase();
		} catch (Exception e) {
			log.error("Hay un error general", e);
			// TODO: handle exception
		}
		
		log.info("Fin del programa: " + new Date());

	}

}
