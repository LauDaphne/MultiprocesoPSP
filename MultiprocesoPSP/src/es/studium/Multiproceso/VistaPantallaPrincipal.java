package es.studium.Multiproceso;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class VistaPantallaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtComando;
	private JButton bttnBloc;
	private JButton bttnPaint;
	private JButton bttnGestion;
	private JButton bttnJuego;
	private JButton bttnAplicarComando;
	private JButton bttnEliminarProceso;
	private JList<String> lstProcesos;
	private DefaultListModel<String> modeloListaProcesos = new DefaultListModel<String>();
	private JTextArea txtAreaComando;
	private JScrollPane scrollTxtArea;



	/**
	 * Create the frame.
	 */
	public VistaPantallaPrincipal() {
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bttnBloc = new JButton("Bloc de notas");
		bttnBloc.setBorder(new LineBorder(new Color(75, 0, 130)));
		bttnBloc.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnBloc.setForeground(new Color(0, 0, 0));
		bttnBloc.setBackground(UIManager.getColor("ComboBox.buttonHighlight"));
		bttnBloc.setBounds(312, 312, 109, 23);
		contentPane.add(bttnBloc);
		
		bttnPaint = new JButton("Paint\r\n");
		bttnPaint.setForeground(Color.BLACK);
		bttnPaint.setBorder(new LineBorder(new Color(75, 0, 130)));
		bttnPaint.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnPaint.setBackground(UIManager.getColor("ComboBox.buttonHighlight"));
		bttnPaint.setBounds(312, 346, 109, 23);
		contentPane.add(bttnPaint);
		
		bttnGestion = new JButton("Gesti\u00F3n");
		bttnGestion.setForeground(Color.BLACK);
		bttnGestion.setBorder(new LineBorder(new Color(75, 0, 130)));
		bttnGestion.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnGestion.setBackground(UIManager.getColor("ComboBox.buttonHighlight"));
		bttnGestion.setBounds(312, 380, 109, 23);
		contentPane.add(bttnGestion);
		
		bttnJuego = new JButton("Juego");
		bttnJuego.setForeground(Color.BLACK);
		bttnJuego.setBorder(new LineBorder(new Color(75, 0, 130)));
		bttnJuego.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnJuego.setBackground(UIManager.getColor("ComboBox.buttonHighlight"));
		bttnJuego.setBounds(312, 414, 109, 23);
		contentPane.add(bttnJuego);
		
		JLabel lblComando = new JLabel(" Comando:");
		lblComando.setBackground(new Color(255, 255, 255));
		lblComando.setForeground(new Color(0, 0, 0));
		lblComando.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComando.setBounds(10, 10, 62, 20);
		contentPane.add(lblComando);
		
		txtComando = new JTextField();
		txtComando.setMargin(new Insets(10, 10, 10, 10));
		txtComando.setCaretColor(Color.GREEN);
		txtComando.setBorder(new EmptyBorder(0, 4, 0, 0));
		txtComando.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtComando.setFont(new Font("Consolas", Font.BOLD, 12));
		txtComando.setForeground(new Color(0, 255, 0));
		txtComando.setBackground(new Color(0, 0, 0));
		txtComando.setBounds(75, 8, 280, 29);
		contentPane.add(txtComando);
		txtComando.setColumns(10);
		
		bttnAplicarComando = new JButton("Aplicar");
		bttnAplicarComando.setBorder(new LineBorder(new Color(75, 0, 130)));
		bttnAplicarComando.setForeground(new Color(0, 0, 0));
		bttnAplicarComando.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnAplicarComando.setBackground(UIManager.getColor("ComboBox.buttonHighlight"));
		bttnAplicarComando.setBounds(361, 9, 71, 23);
		contentPane.add(bttnAplicarComando);
		
		txtAreaComando = new JTextArea();
		txtAreaComando.setForeground(Color.GREEN);
		txtAreaComando.setEditable(false);
		txtAreaComando.setDisabledTextColor(Color.GREEN);
		txtAreaComando.setBackground(new Color(0, 0, 0));
		txtAreaComando.setFont(new Font("Consolas", Font.BOLD, 13));
		txtAreaComando.setSelectionColor(new Color(153, 102, 204));
		txtAreaComando.setBorder(new EmptyBorder(5, 10, 5, 5));
		
		scrollTxtArea = new JScrollPane(txtAreaComando);
		scrollTxtArea.setBounds(10, 49, 422, 227);
		contentPane.add(scrollTxtArea);
		
		
		bttnEliminarProceso = new JButton("Eliminar proceso");
		bttnEliminarProceso.setBorder(new LineBorder(new Color(75, 0, 130)));
		bttnEliminarProceso.setBackground(UIManager.getColor("ComboBox.buttonHighlight"));
		bttnEliminarProceso.setForeground(new Color(0, 0, 0));
		bttnEliminarProceso.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnEliminarProceso.setBounds(79, 448, 125, 23);
		contentPane.add(bttnEliminarProceso);
		
		lstProcesos = new JList<String>(modeloListaProcesos);
		lstProcesos.setBorder(new LineBorder(new Color(75, 0, 130), 2));
		lstProcesos.setBounds(10, 317, 268, 120);
		contentPane.add(lstProcesos);
		
		JLabel lblProcesos = new JLabel("Procesos:");
		lblProcesos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProcesos.setBounds(10, 287, 76, 14);
		contentPane.add(lblProcesos);
		
		JLabel lblProgramas = new JLabel("Programas");
		lblProgramas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProgramas.setBounds(327, 287, 76, 14);
		contentPane.add(lblProgramas);
		setVisible(true);
	}
	
	public JTextArea getTxtAreaComando() {
		return txtAreaComando;
	}

	public JTextField getTxtComando() {
		return txtComando;
	}


	public JButton getBttnBloc() {
		return bttnBloc;
	}


	public JButton getBttnPaint() {
		return bttnPaint;
	}


	public JButton getBttnGestion() {
		return bttnGestion;
	}


	public JButton getBttnJuego() {
		return bttnJuego;
	}


	public JButton getBttnAplicarComando() {
		return bttnAplicarComando;
	}


	public JButton getBttnEliminarProceso() {
		return bttnEliminarProceso;
	}


	public JList<String> getLstProcesos() {
		return lstProcesos;
	}
	
	public DefaultListModel<String> getModeloListaProcesos() {
		return modeloListaProcesos;
	}
}
