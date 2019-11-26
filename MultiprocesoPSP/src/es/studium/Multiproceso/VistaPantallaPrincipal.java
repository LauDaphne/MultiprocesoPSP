package es.studium.Multiproceso;

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
import javax.swing.JList;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class VistaPantallaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton bttnBloc = new JButton("Bloc de notas");
		bttnBloc.setBorder(new LineBorder(new Color(75, 0, 130)));
		bttnBloc.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnBloc.setForeground(new Color(0, 0, 0));
		bttnBloc.setBackground(UIManager.getColor("ComboBox.buttonHighlight"));
		bttnBloc.setBounds(10, 221, 109, 23);
		contentPane.add(bttnBloc);
		
		JButton bttnPaint = new JButton("Paint\r\n");
		bttnPaint.setBorder(new LineBorder(new Color(75, 0, 130)));
		bttnPaint.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnPaint.setBackground(UIManager.getColor("ComboBox.buttonHighlight"));
		bttnPaint.setBounds(125, 221, 93, 23);
		contentPane.add(bttnPaint);
		
		JButton bttnGestion = new JButton("Gesti\u00F3n");
		bttnGestion.setBorder(new LineBorder(new Color(75, 0, 130)));
		bttnGestion.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnGestion.setBackground(UIManager.getColor("ComboBox.buttonHighlight"));
		bttnGestion.setBounds(222, 221, 103, 23);
		contentPane.add(bttnGestion);
		
		JButton bttnJuego = new JButton("Juego");
		bttnJuego.setBorder(new LineBorder(new Color(75, 0, 130)));
		bttnJuego.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnJuego.setBackground(UIManager.getColor("ComboBox.buttonHighlight"));
		bttnJuego.setBounds(329, 221, 103, 23);
		contentPane.add(bttnJuego);
		
		JLabel lblComando = new JLabel(" Comando:");
		lblComando.setBackground(new Color(255, 255, 255));
		lblComando.setForeground(new Color(0, 0, 0));
		lblComando.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComando.setBounds(10, 8, 62, 20);
		contentPane.add(lblComando);
		
		txtComando = new JTextField();
		txtComando.setBounds(75, 8, 280, 20);
		contentPane.add(txtComando);
		txtComando.setColumns(10);
		
		JButton bttnComando = new JButton("Aplicar");
		bttnComando.setBorder(new LineBorder(new Color(75, 0, 130)));
		bttnComando.setForeground(new Color(0, 0, 0));
		bttnComando.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttnComando.setBackground(UIManager.getColor("ComboBox.buttonHighlight"));
		bttnComando.setBounds(361, 7, 71, 23);
		contentPane.add(bttnComando);
		
		JTextArea txtAreaComando = new JTextArea();
		txtAreaComando.setSelectionColor(new Color(153, 102, 204));
		txtAreaComando.setBorder(new LineBorder(new Color(75, 0, 130), 2));
		txtAreaComando.setBounds(10, 36, 422, 174);
		contentPane.add(txtAreaComando);
		
		JButton bttnEliminar = new JButton("Eliminar proceso");
		bttnEliminar.setBorder(new LineBorder(new Color(75, 0, 130)));
		bttnEliminar.setBackground(UIManager.getColor("ComboBox.buttonHighlight"));
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
