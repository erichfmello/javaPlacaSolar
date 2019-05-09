package Principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import paineis.*;
public class CadastrarBateria {

	public JFrame frmCadastrarBateria;
	private JTextField textFieldFabricanteBateria;
	private JTextField textFieldNomeBateria;
	private JTextField textFieldTensaoBateria;
	private JButton btnCancelar;
	private JButton btnOk;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarBateria window = new CadastrarBateria();
					window.frmCadastrarBateria.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastrarBateria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastrarBateria = new JFrame();
		frmCadastrarBateria.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\Bateria.jpg"));
		frmCadastrarBateria.setTitle("Cadastrar Bateria");
		frmCadastrarBateria.setBounds(100, 100, 320, 201);
		frmCadastrarBateria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastrarBateria.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fabricante da bateria:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 11, 128, 14);
		frmCadastrarBateria.getContentPane().add(lblNewLabel);
		
		JLabel lblModeloDaBateria = new JLabel("Modelo da bateria:");
		lblModeloDaBateria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModeloDaBateria.setBounds(10, 36, 128, 14);
		frmCadastrarBateria.getContentPane().add(lblModeloDaBateria);
		
		JLabel lblTensoDaBateria = new JLabel("Tens\u00E3o da bateria:");
		lblTensoDaBateria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTensoDaBateria.setBounds(10, 61, 128, 14);
		frmCadastrarBateria.getContentPane().add(lblTensoDaBateria);
		
		textFieldFabricanteBateria = new JTextField();
		textFieldFabricanteBateria.setBounds(148, 8, 129, 20);
		frmCadastrarBateria.getContentPane().add(textFieldFabricanteBateria);
		textFieldFabricanteBateria.setColumns(10);
		
		textFieldNomeBateria = new JTextField();
		textFieldNomeBateria.setColumns(10);
		textFieldNomeBateria.setBounds(148, 33, 129, 20);
		frmCadastrarBateria.getContentPane().add(textFieldNomeBateria);
		
		textFieldTensaoBateria = new JTextField();
		textFieldTensaoBateria.setColumns(10);
		textFieldTensaoBateria.setBounds(148, 58, 129, 20);
		frmCadastrarBateria.getContentPane().add(textFieldTensaoBateria);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadastrarBateria.dispose();
			}
		});
		btnCancelar.setBounds(205, 128, 89, 23);
		frmCadastrarBateria.getContentPane().add(btnCancelar);
		
		btnOk = new JButton("Ok");
		btnOk.setBounds(205, 94, 89, 23);
		frmCadastrarBateria.getContentPane().add(btnOk);
	}
	
	
	// Overload
	public CadastrarBateria(DadosDaBateria bateria) {
		initialize(bateria);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(DadosDaBateria bateria) {
		frmCadastrarBateria = new JFrame();
		frmCadastrarBateria.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\Bateria.jpg"));
		frmCadastrarBateria.setTitle("Cadastrar Bateria");
		frmCadastrarBateria.setBounds(100, 100, 320, 201);
		frmCadastrarBateria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastrarBateria.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fabricante da bateria:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 11, 128, 14);
		frmCadastrarBateria.getContentPane().add(lblNewLabel);
		
		JLabel lblModeloDaBateria = new JLabel("Modelo da bateria:");
		lblModeloDaBateria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModeloDaBateria.setBounds(10, 36, 128, 14);
		frmCadastrarBateria.getContentPane().add(lblModeloDaBateria);
		
		JLabel lblTensoDaBateria = new JLabel("Tens\u00E3o da bateria:");
		lblTensoDaBateria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTensoDaBateria.setBounds(10, 61, 128, 14);
		frmCadastrarBateria.getContentPane().add(lblTensoDaBateria);
		
		textFieldFabricanteBateria = new JTextField();
		textFieldFabricanteBateria.setBounds(148, 8, 129, 20);
		frmCadastrarBateria.getContentPane().add(textFieldFabricanteBateria);
		textFieldFabricanteBateria.setColumns(10);
		
		textFieldNomeBateria = new JTextField();
		textFieldNomeBateria.setColumns(10);
		textFieldNomeBateria.setBounds(148, 33, 129, 20);
		frmCadastrarBateria.getContentPane().add(textFieldNomeBateria);
		
		textFieldTensaoBateria = new JTextField();
		textFieldTensaoBateria.setColumns(10);
		textFieldTensaoBateria.setBounds(148, 58, 129, 20);
		frmCadastrarBateria.getContentPane().add(textFieldTensaoBateria);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadastrarBateria.dispose();
			}
		});
		btnCancelar.setBounds(205, 128, 89, 23);
		frmCadastrarBateria.getContentPane().add(btnCancelar);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bateria.setFabricanteBateria(textFieldFabricanteBateria.getText());
				bateria.setNomeBateria(textFieldNomeBateria.getText());
				bateria.setTensaoBateria(Double.parseDouble(textFieldTensaoBateria.getText()));
				
				frmCadastrarBateria.dispose();
			}
		});
		btnOk.setBounds(205, 94, 89, 23);
		frmCadastrarBateria.getContentPane().add(btnOk);
	}

}
