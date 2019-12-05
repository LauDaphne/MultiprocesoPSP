package es.studium.Multiproceso;

public class Proceso {
	
	private String nombreAsignado;
	private String nombreProceso;
	private String rutaJar;
	private String pid;
	
	public Proceso() {
		this.nombreAsignado = "";
		this.nombreProceso = "";
		this.pid = "";
		this.rutaJar="";
	}
	
	public Proceso(String nombreAsignado, String nombreProceso, String pid) {
		this.nombreAsignado = nombreAsignado;
		this.nombreProceso = nombreProceso;
		this.pid = pid;
		this.rutaJar="";
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
