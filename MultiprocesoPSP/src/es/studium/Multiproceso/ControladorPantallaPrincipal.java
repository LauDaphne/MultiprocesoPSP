package es.studium.Multiproceso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPantallaPrincipal implements ActionListener {
	
	VistaPantallaPrincipal objVista = new VistaPantallaPrincipal();
	ModeloPantallaPrincipal objModelo = new ModeloPantallaPrincipal();
	Proceso prcsBloc= new Proceso ("Bloc de notas","notepad.exe","0");
	Proceso prcsPaint= new Proceso ("Paint","mspaint.exe","0");
	Proceso prcsGestion= new Proceso ("Programa Gestión","java.exe","0");
	Proceso prcsJuego= new Proceso ("Programa Juego","java.exe","0");
	
	
	
	ControladorPantallaPrincipal(){
		prcsJuego.setRutaJar("/juego/CarmenSanDiego.jar");
		prcsGestion.setRutaJar("/gestion/ClubDeTenis.jar");
		//Agregamos los listeners
		objVista.getBttnAplicarComando().addActionListener(this);
		objVista.getBttnEliminarProceso().addActionListener(this);
		objVista.getBttnBloc().addActionListener(this);
		objVista.getBttnPaint().addActionListener(this);
		objVista.getBttnGestion().addActionListener(this);
		objVista.getBttnJuego().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(objVista.getBttnEliminarProceso())) {
			objVista.getLstProcesos().getSelectedIndex();
			objVista.getBttnBloc().setEnabled(false);
		}
		
		if(e.getSource().equals(objVista.getBttnBloc())) {
			objModelo.crearProceso(prcsBloc);
			objVista.getBttnBloc().setEnabled(false);
			objVista.getModeloListaProcesos().addElement(prcsBloc.muestraDatos());
		}
		
		if(e.getSource().equals(objVista.getBttnPaint())) {
			objModelo.crearProceso(prcsPaint);
			objVista.getBttnPaint().setEnabled(false);
			objVista.getModeloListaProcesos().addElement(prcsPaint.muestraDatos());
		}
		
		if(e.getSource().equals(objVista.getBttnGestion())) {
			objModelo.crearProceso(prcsGestion);
			objVista.getBttnGestion().setEnabled(false);
			objVista.getModeloListaProcesos().addElement(prcsGestion.muestraDatos());
		}
		
		if(e.getSource().equals(objVista.getBttnJuego())) {
			objModelo.crearProceso(prcsJuego);
			objVista.getBttnJuego().setEnabled(false);
			objVista.getModeloListaProcesos().addElement(prcsJuego.muestraDatos());
		}
	}

	
}
