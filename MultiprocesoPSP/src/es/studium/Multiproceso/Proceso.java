package es.studium.Multiproceso;

import javax.swing.JButton;

public class Proceso {
	
	private String nombreAsignado;
	private String nombreProceso;
	private JButton idObjetoVista;
	private String rutaJar;
	private String pid;
	
	public Proceso() {
		this.nombreAsignado = "";
		this.nombreProceso = "";
		this.pid = "";
		this.rutaJar="";
		this.idObjetoVista=null;
	}
	
	public Proceso(String nombreAsignado, String nombreProceso, String pid, JButton idObjetoVista) {
		this.nombreAsignado = nombreAsignado;
		this.nombreProceso = nombreProceso;
		this.pid = pid;
		this.idObjetoVista= idObjetoVista;
		this.rutaJar="";
	}

	public JButton getIdObjetoVista() {
		return idObjetoVista;
	}

	public void setIdObjetoVista(JButton idObjetoVista) {
		this.idObjetoVista = idObjetoVista;
	}

	public String getRutaJar() {
		return rutaJar;
	}

	public void setRutaJar(String rutaJar) {
		this.rutaJar = rutaJar;
	}

	public String getNombreAsignado() {
		return nombreAsignado;
	}

	public void setNombreAsignado(String nombreAsignado) {
		this.nombreAsignado = nombreAsignado;
	}

	public String getNombreProceso() {
		return nombreProceso;
	}

	public void setNombreProceso(String nombreProceso) {
		this.nombreProceso = nombreProceso;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	
	public String muestraDatos() {
		return nombreAsignado+" - "+nombreProceso+" - "+pid;
	}
	
}
