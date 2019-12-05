package es.studium.Multiproceso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPantallaPrincipal implements ActionListener {
	
	private VistaPantallaPrincipal objVista = new VistaPantallaPrincipal();
	private ModeloPantallaPrincipal objModelo = new ModeloPantallaPrincipal();
	
	private Proceso prcsBloc= new Proceso ("Bloc de notas","notepad.exe","0", objVista.getBttnBloc());
	private Proceso prcsPaint= new Proceso ("Paint","mspaint.exe","0", objVista.getBttnPaint());
	private Proceso prcsGestion= new Proceso ("Programa Gestión","java.exe","0", objVista.getBttnGestion());
	private Proceso prcsJuego= new Proceso ("Programa Juego","java.exe","0", objVista.getBttnJuego());
	
	private Proceso procesos []= {prcsBloc, prcsPaint, prcsGestion, prcsJuego};
	
	
	
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
		
		if(e.getSource().equals(objVista.getBttnAplicarComando())) {
			objModelo.ejecutarComandos(objVista.getTxtComando().getText(), objVista.getTxtAreaComando());
		}
		
		if(e.getSource().equals(objVista.getBttnEliminarProceso())) {
			objModelo.reconocerProceso(objVista.getModeloListaProcesos().getElementAt(objVista.getLstProcesos().getSelectedIndex()), procesos);
			objVista.getModeloListaProcesos().remove(objVista.getLstProcesos().getSelectedIndex());
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
