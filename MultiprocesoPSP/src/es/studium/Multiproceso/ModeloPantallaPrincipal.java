package es.studium.Multiproceso;

import java.io.IOException;
import java.util.Arrays;

public class ModeloPantallaPrincipal {
	
	public void abrirBlocNotas(String[] args){
		
		ProcessBuilder pb = new ProcessBuilder(args);
		try
		{
			System.out.println("Ejecutando " + Arrays.toString(args));
			Process process = pb.start();
			// Esperamos que termine el proceso
			int retorno = process.waitFor();
			System.out.println("La ejecución de " + Arrays.toString(args) + " devuelve " + retorno);
		}
		catch (IOException ex)
		{
			System.err.println("Excepción de E/S!!");
			System.exit(-1);
		} 
		catch (InterruptedException ex)
		{
			System.err.println("El proceso hijo finalizó de forma errónea");
			System.exit(-1);
		}
	}
}
