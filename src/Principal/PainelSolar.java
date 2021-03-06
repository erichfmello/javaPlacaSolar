package Principal;
import paineis.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controladores.*;

public class PainelSolar {

	public JFrame frmPaineisSolares;
	public DadosDaBateria bateria = new DadosDaBateria("Nome", "Nome", 0); 
	CadastrarBateria cadastrarBateria;
	CadastroPaineis cadastrarPaineis = new CadastroPaineis();
	Controladores controladoresDeCarga;
	public int wp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PainelSolar window = new PainelSolar();
					window.frmPaineisSolares.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PainelSolar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPaineisSolares = new JFrame();
		frmPaineisSolares.setTitle("Paineis Solares");
		frmPaineisSolares.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\dimensionamento.jpg"));
		frmPaineisSolares.setBounds(100, 100, 374, 188);
		frmPaineisSolares.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPaineisSolares.getContentPane().setLayout(null);
		
		JButton btnBateria = new JButton("Bateria");
		btnBateria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarBateria = new CadastrarBateria(bateria);
				cadastrarBateria.frmCadastrarBateria.setVisible(true);
			}
		});
		btnBateria.setBounds(10, 11, 157, 23);
		frmPaineisSolares.getContentPane().add(btnBateria);
		
		JButton btnPaineisSolares = new JButton("Paineis Solares");
		btnPaineisSolares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarPaineis = new CadastroPaineis();
				cadastrarPaineis.frmCadastrarPaineis.setVisible(true);
			}
		});
		btnPaineisSolares.setBounds(10, 45, 157, 23);
		frmPaineisSolares.getContentPane().add(btnPaineisSolares);
		
		JLabel lblCadastrarBateria = new JLabel("Cadastrar bateria");
		lblCadastrarBateria.setBounds(177, 15, 197, 14);
		frmPaineisSolares.getContentPane().add(lblCadastrarBateria);
		
		JLabel lblCadastrarPaineisSolares = new JLabel("Cadastrar paineis solares");
		lblCadastrarPaineisSolares.setBounds(177, 49, 197, 14);
		frmPaineisSolares.getContentPane().add(lblCadastrarPaineisSolares);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPaineisSolares.dispose();
			}
		});
		btnCancelar.setBounds(240, 115, 89, 23);
		frmPaineisSolares.getContentPane().add(btnCancelar);
		
		JButton btnInversores = new JButton("Controladores");
		btnInversores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladoresDeCarga = new Controladores();
				controladoresDeCarga.frmControladores.setVisible(true);
			}
		});
		btnInversores.setBounds(10, 79, 157, 23);
		frmPaineisSolares.getContentPane().add(btnInversores);
		
		JLabel lblCalculoDosInversores = new JLabel("Calculo dos Controladores de carga");
		lblCalculoDosInversores.setBounds(177, 83, 197, 14);
		frmPaineisSolares.getContentPane().add(lblCalculoDosInversores);
	}
	
	public PainelSolar(int wp) {
		initialize(wp);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int wp) {
		this.wp = wp;
		frmPaineisSolares = new JFrame();
		frmPaineisSolares.setTitle("Paineis Solares");
		frmPaineisSolares.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\dimensionamento.jpg"));
		frmPaineisSolares.setBounds(100, 100, 350, 188);
		frmPaineisSolares.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPaineisSolares.getContentPane().setLayout(null);
		
		JButton btnBateria = new JButton("Bateria");
		btnBateria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarBateria = new CadastrarBateria(bateria);
				cadastrarBateria.frmCadastrarBateria.setVisible(true);
			}
		});
		btnBateria.setBounds(10, 11, 157, 23);
		frmPaineisSolares.getContentPane().add(btnBateria);
		
		JButton btnPaineisSolares = new JButton("Paineis Solares");
		btnPaineisSolares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bateria.getTensaoBateria() != 0) {
					cadastrarPaineis = new CadastroPaineis(bateria, wp);					
					cadastrarPaineis.frmCadastrarPaineis.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "� necess�rio a cria��o da bateria com tens�o maior que zero!!!");
				}
			}
		});
		btnPaineisSolares.setBounds(10, 45, 157, 23);
		frmPaineisSolares.getContentPane().add(btnPaineisSolares);
		
		JLabel lblCadastrarBateria = new JLabel("Cadastrar bateria");
		lblCadastrarBateria.setBounds(177, 15, 152, 14);
		frmPaineisSolares.getContentPane().add(lblCadastrarBateria);
		
		JLabel lblCadastrarPaineisSolares = new JLabel("Cadastrar paineis solares");
		lblCadastrarPaineisSolares.setBounds(177, 49, 152, 14);
		frmPaineisSolares.getContentPane().add(lblCadastrarPaineisSolares);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPaineisSolares.dispose();
			}
		});
		btnCancelar.setBounds(240, 115, 89, 23);
		frmPaineisSolares.getContentPane().add(btnCancelar);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPaineisSolares.dispose();
			}
		});
		btnOk.setBounds(240, 81, 89, 23);
		frmPaineisSolares.getContentPane().add(btnOk);
		
		JButton btnInversores = new JButton("Controladores");
		btnInversores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladoresDeCarga = new Controladores(cadastrarPaineis);
				controladoresDeCarga.frmControladores.setVisible(true);
			}
		});
		btnInversores.setBounds(10, 79, 157, 23);
		frmPaineisSolares.getContentPane().add(btnInversores);
	}
}
