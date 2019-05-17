package Principal;
import Controladores.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controladores {

	public JFrame frmControladores;
	private JTextField textFieldFabricante;
	private JTextField textFieldModelo;
	private JTextField textFieldTensao;
	private JTextField textFieldCorrente;
	public DadosControladorDeCarga controladoresDeCarga;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controladores window = new Controladores();
					window.frmControladores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Controladores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmControladores = new JFrame();
		frmControladores.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\Controlador.jpg"));
		frmControladores.setTitle("Controladores");
		frmControladores.setBounds(100, 100, 340, 229);
		frmControladores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmControladores.getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Fabricante:");
		lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo.setBounds(10, 11, 63, 14);
		frmControladores.getContentPane().add(lblModelo);
		
		JLabel lblModelo_1 = new JLabel("Modelo: ");
		lblModelo_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo_1.setBounds(10, 36, 63, 14);
		frmControladores.getContentPane().add(lblModelo_1);
		
		JLabel lblTenso = new JLabel("Tens\u00E3o:");
		lblTenso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTenso.setBounds(10, 61, 63, 14);
		frmControladores.getContentPane().add(lblTenso);
		
		JLabel lblCorrente = new JLabel("Corrente:");
		lblCorrente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCorrente.setBounds(10, 86, 63, 14);
		frmControladores.getContentPane().add(lblCorrente);
		
		textFieldFabricante = new JTextField();
		textFieldFabricante.setBounds(83, 8, 86, 20);
		frmControladores.getContentPane().add(textFieldFabricante);
		textFieldFabricante.setColumns(10);
		
		textFieldModelo = new JTextField();
		textFieldModelo.setColumns(10);
		textFieldModelo.setBounds(83, 33, 86, 20);
		frmControladores.getContentPane().add(textFieldModelo);
		
		textFieldTensao = new JTextField();
		textFieldTensao.setColumns(10);
		textFieldTensao.setBounds(83, 58, 86, 20);
		frmControladores.getContentPane().add(textFieldTensao);
		
		textFieldCorrente = new JTextField();
		textFieldCorrente.setColumns(10);
		textFieldCorrente.setBounds(83, 83, 86, 20);
		frmControladores.getContentPane().add(textFieldCorrente);
			
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(225, 156, 89, 23);
		frmControladores.getContentPane().add(btnCancelar);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(225, 122, 89, 23);
		frmControladores.getContentPane().add(btnOk);
	}
	
	public Controladores(CadastroPaineis cadastroPaineis) {
		initialize(cadastroPaineis);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(CadastroPaineis cadastroPaineis) {
		frmControladores = new JFrame();
		frmControladores.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\Controlador.jpg"));
		frmControladores.setTitle("Controladores");
		frmControladores.setBounds(100, 100, 340, 229);
		frmControladores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmControladores.getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Fabricante:");
		lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo.setBounds(10, 11, 63, 14);
		frmControladores.getContentPane().add(lblModelo);
		
		JLabel lblModelo_1 = new JLabel("Modelo: ");
		lblModelo_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo_1.setBounds(10, 36, 63, 14);
		frmControladores.getContentPane().add(lblModelo_1);
		
		JLabel lblTenso = new JLabel("Tens\u00E3o:");
		lblTenso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTenso.setBounds(10, 61, 63, 14);
		frmControladores.getContentPane().add(lblTenso);
		
		JLabel lblCorrente = new JLabel("Corrente:");
		lblCorrente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCorrente.setBounds(10, 86, 63, 14);
		frmControladores.getContentPane().add(lblCorrente);
		
		textFieldFabricante = new JTextField();
		textFieldFabricante.setBounds(83, 8, 86, 20);
		frmControladores.getContentPane().add(textFieldFabricante);
		textFieldFabricante.setColumns(10);
		
		textFieldModelo = new JTextField();
		textFieldModelo.setColumns(10);
		textFieldModelo.setBounds(83, 33, 86, 20);
		frmControladores.getContentPane().add(textFieldModelo);
		
		textFieldTensao = new JTextField();
		textFieldTensao.setColumns(10);
		textFieldTensao.setBounds(83, 58, 86, 20);
		frmControladores.getContentPane().add(textFieldTensao);
		
		textFieldCorrente = new JTextField();
		textFieldCorrente.setColumns(10);
		textFieldCorrente.setBounds(83, 83, 86, 20);
		frmControladores.getContentPane().add(textFieldCorrente);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladoresDeCarga = new DadosControladorDeCarga(textFieldFabricante.getText(), textFieldModelo.getText(), Double.parseDouble(textFieldTensao.getText()),
						Double.parseDouble(textFieldCorrente.getText()), cadastroPaineis.dimensionamento.getPotenciaDeFato() * cadastroPaineis.dimensionamento.getNumeroDePaineis());
				frmControladores.dispose();
			}
		});
		btnOk.setBounds(225, 122, 89, 23);
		frmControladores.getContentPane().add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmControladores.dispose();
			}
		});
		btnCancelar.setBounds(225, 156, 89, 23);
		frmControladores.getContentPane().add(btnCancelar);
	}
}
