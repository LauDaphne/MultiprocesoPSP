package es.studium.Multiproceso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JList;

public class VistaPantallaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtComando;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPantallaPrincipal frame = new VistaPantallaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaPantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton bttnBloc = new JButton("Bloc de notas");
		bttnBloc.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnBloc.setForeground(new Color(0, 0, 0));
		bttnBloc.setBackground(new Color(75, 0, 130));
		bttnBloc.setBounds(10, 221, 109, 23);
		contentPane.add(bttnBloc);
		
		JButton bttnPaint = new JButton("Paint\r\n");
		bttnPaint.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnPaint.setBackground(new Color(75, 0, 130));
		bttnPaint.setBounds(125, 221, 93, 23);
		contentPane.add(bttnPaint);
		
		JButton bttnGestion = new JButton("Gesti\u00F3n");
		bttnGestion.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnGestion.setBackground(new Color(75, 0, 130));
		bttnGestion.setBounds(222, 221, 103, 23);
		contentPane.add(bttnGestion);
		
		JButton bttnJuego = new JButton("Juego");
		bttnJuego.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnJuego.setBackground(new Color(75, 0, 130));
		bttnJuego.setBounds(329, 221, 103, 23);
		contentPane.add(bttnJuego);
		
		JLabel lblComando = new JLabel(" Comando:");
		lblComando.setBackground(new Color(255, 255, 255));
		lblComando.setForeground(new Color(0, 0, 0));
		lblComando.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComando.setBounds(10, 8, 62, 20);
		contentPane.add(lblComando);
		
		txtComando = new JTextField();
		txtComando.setBounds(75, 8, 262, 20);
		contentPane.add(txtComando);
		txtComando.setColumns(10);
		
		JButton bttnComando = new JButton("Aplicar");
		bttnComando.setForeground(new Color(0, 0, 0));
		bttnComando.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnComando.setBackground(new Color(75, 0, 130));
		bttnComando.setBounds(343, 7, 89, 23);
		contentPane.add(bttnComando);
		
		JTextArea txtAreaComando = new JTextArea();
		txtAreaComando.setSelectionColor(new Color(153, 102, 204));
		txtAreaComando.setBorder(new LineBorder(new Color(75, 0, 130), 2));
		txtAreaComando.setBounds(10, 36, 422, 174);
		contentPane.add(txtAreaComando);
		
		JButton bttnEliminar = new JButton("Eliminar proceso");
		bttnEliminar.setBackground(new Color(75, 0, 130));
		bttnEliminar.setForeground(new Color(0, 0, 0));
		bttnEliminar.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnEliminar.setBounds(153, 448, 125, 23);
		contentPane.add(bttnEliminar);
		
		JList lstProcesos = new JList();
		lstProcesos.setBorder(new LineBorder(new Color(75, 0, 130), 2));
		lstProcesos.setBounds(10, 253, 422, 184);
		contentPane.add(lstProcesos);
	}
}
