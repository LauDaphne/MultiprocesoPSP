package es.studium.Multiproceso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JTextArea;

public class ModeloPantallaPrincipal {

	public void crearProceso(Proceso proceso) {
		Runtime rt = Runtime.getRuntime();
		BufferedReader lectura;
		String[] listaDatos;
		Process prcss;
		String resultado;

		try {
			if (proceso.getNombreProceso().equals("java.exe")) {
				String ruta = ControladorPantallaPrincipal.class.getResource(proceso.getRutaJar()).getPath();
				ruta = ruta.substring(1);
				prcss = rt.exec("cmd /C java -jar " + ruta);
			} else {
				prcss = rt.exec(proceso.getNombreProceso());

			}
			prcss = Runtime.getRuntime()
					.exec("cmd /C tasklist /fi \"imagename eq " + proceso.getNombreProceso() + "\" /fo csv /nh");
			lectura = new BufferedReader(new InputStreamReader(prcss.getInputStream()));

			while ((resultado = lectura.readLine()) != null) {
				listaDatos = resultado.split(",");
				proceso.setPid((listaDatos[1]).substring(1, (listaDatos[1].length() - 1)));
			}

		} catch (IOException e) {
			System.err.println("Error al crear el proceso");
		}
	}

	public void reconocerProceso(String eleccion, Proceso[] procesos) {

		String[] listaDatos = eleccion.split(" - ");
		
		try {
			
			Process prcss = Runtime.getRuntime().exec("cmd /C taskkill /pid " + listaDatos[2]);
			
			for (Proceso pr : procesos) {
				if (pr.getPid().equals(listaDatos[2])) {
					pr.getIdObjetoVista().setEnabled(true);
				}
			}
			prcss.onExit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ejecutarComandos(String comando, JTextArea consola) {
		consola.setText("");
		try {
			Process prcss = Runtime.getRuntime().exec("cmd /C "+comando);
			String lineaCodigo;
			BufferedReader lectura = new BufferedReader(new InputStreamReader(prcss.getInputStream()));
			while((lineaCodigo =lectura.readLine())!= null) {
				consola.append(lineaCodigo+"\n");
			}
			prcss.onExit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
