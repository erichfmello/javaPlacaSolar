package Principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import paineis.CalculosPaineisSolares;
import paineis.DadosDaBateria;

import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroPaineis {

	public JFrame frmCadastrarPaineis;
	private JTextField textFieldTempo;
	private JTextField textFieldTensao;
	private JTextField textFieldCorrente;
	public CalculosPaineisSolares dimensionamento;	
	int wp = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPaineis window = new CadastroPaineis();
					window.frmCadastrarPaineis.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroPaineis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastrarPaineis = new JFrame();
		frmCadastrarPaineis.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\Bateria.jpg"));
		frmCadastrarPaineis.setTitle("Cadastrar Paineis");
		frmCadastrarPaineis.setBounds(100, 100, 347, 200);
		frmCadastrarPaineis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastrarPaineis.getContentPane().setLayout(null);
		
		JLabel lblXxx = new JLabel("Tempo m\u00E9dio de insola\u00E7\u00E3o:");
		lblXxx.setHorizontalAlignment(SwingConstants.RIGHT);
		lblXxx.setBounds(10, 11, 181, 14);
		frmCadastrarPaineis.getContentPane().add(lblXxx);
		
		JLabel lblTensoDoPainel = new JLabel("Tens\u00E3o do Painel:");
		lblTensoDoPainel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTensoDoPainel.setBounds(10, 36, 181, 14);
		frmCadastrarPaineis.getContentPane().add(lblTensoDoPainel);
		
		JLabel lblCorrenteDoPainel = new JLabel("Corrente do Painel:");
		lblCorrenteDoPainel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCorrenteDoPainel.setBounds(10, 61, 181, 14);
		frmCadastrarPaineis.getContentPane().add(lblCorrenteDoPainel);
		
		textFieldTempo = new JTextField();
		textFieldTempo.setBounds(201, 8, 86, 20);
		frmCadastrarPaineis.getContentPane().add(textFieldTempo);
		textFieldTempo.setColumns(10);
		
		textFieldTensao = new JTextField();
		textFieldTensao.setColumns(10);
		textFieldTensao.setBounds(201, 33, 86, 20);
		frmCadastrarPaineis.getContentPane().add(textFieldTensao);
		
		textFieldCorrente = new JTextField();
		textFieldCorrente.setColumns(10);
		textFieldCorrente.setBounds(201, 58, 86, 20);
		frmCadastrarPaineis.getContentPane().add(textFieldCorrente);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadastrarPaineis.dispose();
			}
		});
		btnCancelar.setBounds(232, 133, 89, 23);
		frmCadastrarPaineis.getContentPane().add(btnCancelar);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(232, 99, 89, 23);
		frmCadastrarPaineis.getContentPane().add(btnOk);
	}
	
	public CadastroPaineis(DadosDaBateria bateria, int wp) {
		initialize(bateria, wp);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(DadosDaBateria bateria, int wp) {
		this.wp = wp;
		frmCadastrarPaineis = new JFrame();
		frmCadastrarPaineis.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\Bateria.jpg"));
		frmCadastrarPaineis.setTitle("Cadastrar Paineis");
		frmCadastrarPaineis.setBounds(100, 100, 347, 200);
		frmCadastrarPaineis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastrarPaineis.getContentPane().setLayout(null);
		
		JLabel lblXxx = new JLabel("Tempo m\u00E9dio de insola\u00E7\u00E3o:");
		lblXxx.setHorizontalAlignment(SwingConstants.RIGHT);
		lblXxx.setBounds(10, 11, 181, 14);
		frmCadastrarPaineis.getContentPane().add(lblXxx);
		
		JLabel lblTensoDoPainel = new JLabel("Tens\u00E3o do Painel:");
		lblTensoDoPainel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTensoDoPainel.setBounds(10, 36, 181, 14);
		frmCadastrarPaineis.getContentPane().add(lblTensoDoPainel);
		
		JLabel lblCorrenteDoPainel = new JLabel("Corrente do Painel:");
		lblCorrenteDoPainel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCorrenteDoPainel.setBounds(10, 61, 181, 14);
		frmCadastrarPaineis.getContentPane().add(lblCorrenteDoPainel);
		
		textFieldTempo = new JTextField();
		textFieldTempo.setBounds(201, 8, 86, 20);
		frmCadastrarPaineis.getContentPane().add(textFieldTempo);
		textFieldTempo.setColumns(10);
		
		textFieldTensao = new JTextField();
		textFieldTensao.setColumns(10);
		textFieldTensao.setBounds(201, 33, 86, 20);
		frmCadastrarPaineis.getContentPane().add(textFieldTensao);
		
		textFieldCorrente = new JTextField();
		textFieldCorrente.setColumns(10);
		textFieldCorrente.setBounds(201, 58, 86, 20);
		frmCadastrarPaineis.getContentPane().add(textFieldCorrente);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadastrarPaineis.dispose();
			}
		});
		btnCancelar.setBounds(232, 133, 89, 23);
		frmCadastrarPaineis.getContentPane().add(btnCancelar);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dimensionamento = new CalculosPaineisSolares(Double.parseDouble(textFieldTensao.getText()), Double.parseDouble(textFieldCorrente.getText()), bateria.getTensaoBateria(), 
						(wp/Double.parseDouble(textFieldTempo.getText())));
				frmCadastrarPaineis.dispose();
			}
		});
		
		btnOk.setBounds(232, 99, 89, 23);
		frmCadastrarPaineis.getContentPane().add(btnOk);
	}
}
