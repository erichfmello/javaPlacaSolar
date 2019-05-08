package Principal;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import cadastros.*;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Equipamento {

	public JFrame frmEquipamento;
	private JTextField textFieldQuantidade;
	private JTextField textFieldConsumoUnitario;
	private JTextField textFieldHorasUso;
	private JTextField textFieldNome;
	
	public String nome;
	public int quantidade;
	int consumoUnitario;
	int consumoTotal;
	int horasDeUso;
	int consumoTotalDiarioW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Equipamento window = new Equipamento();
					window.frmEquipamento.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Equipamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		frmEquipamento = new JFrame();
		frmEquipamento.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\equipResid.jpg"));
		frmEquipamento.setTitle("Equipamento");
		frmEquipamento.setBounds(100, 100, 333, 300);
		frmEquipamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEquipamento.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(26, 10, 119, 14);
		frmEquipamento.getContentPane().add(lblNewLabel);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidade.setBounds(26, 36, 119, 14);
		frmEquipamento.getContentPane().add(lblQuantidade);
		
		JLabel lblConsumo = new JLabel("Consumo unit\u00E1rio:");
		lblConsumo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConsumo.setBounds(10, 61, 135, 14);
		frmEquipamento.getContentPane().add(lblConsumo);
		
		JLabel lblHorasDeUso = new JLabel("Horas de uso por dia:");
		lblHorasDeUso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHorasDeUso.setBounds(10, 86, 135, 14);
		frmEquipamento.getContentPane().add(lblHorasDeUso);
		
		textFieldQuantidade = new JTextField();
		textFieldQuantidade.setColumns(10);
		textFieldQuantidade.setBounds(155, 29, 86, 20);
		frmEquipamento.getContentPane().add(textFieldQuantidade);
		
		textFieldConsumoUnitario = new JTextField();
		textFieldConsumoUnitario.setColumns(10);
		textFieldConsumoUnitario.setBounds(155, 55, 86, 20);
		frmEquipamento.getContentPane().add(textFieldConsumoUnitario);
		
		textFieldHorasUso = new JTextField();
		textFieldHorasUso.setColumns(10);
		textFieldHorasUso.setBounds(155, 80, 86, 20);
		frmEquipamento.getContentPane().add(textFieldHorasUso);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEquipamento.dispose();
			}
		});
		btnCancelar.setBounds(218, 227, 89, 23);
		frmEquipamento.getContentPane().add(btnCancelar);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome = textFieldNome.getText();
				quantidade = Integer.parseInt(textFieldQuantidade.getText());
				consumoUnitario = Integer.parseInt(textFieldConsumoUnitario.getText());
				consumoTotal = quantidade * consumoUnitario;
				horasDeUso = Integer.parseInt(textFieldHorasUso.getText());
				consumoTotalDiarioW = consumoTotal * horasDeUso;
				frmEquipamento.dispose();
			}
		});
		btnOk.setBounds(218, 193, 89, 23);
		frmEquipamento.getContentPane().add(btnOk);
		
		textFieldNome = new JTextField();
		textFieldNome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				String nomeDois = textFieldNome.getText();
				frmEquipamento.setTitle(nomeDois);
			}
		});
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(155, 4, 86, 20);
		frmEquipamento.getContentPane().add(textFieldNome);
		
		JButton btnVerificarValores = new JButton("Verificar valores");
		btnVerificarValores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nome = textFieldNome.getText();
				quantidade = Integer.parseInt(textFieldQuantidade.getText());
				consumoUnitario = Integer.parseInt(textFieldConsumoUnitario.getText());
				consumoTotal = quantidade * consumoUnitario;
				horasDeUso = Integer.parseInt(textFieldHorasUso.getText());
				consumoTotalDiarioW = consumoTotal * horasDeUso;
				
				JOptionPane.showMessageDialog(null, "Nome: " + nome 
						+ "\nQuantidade: " + quantidade
						+ "\nConsumo unitário: " + consumoUnitario + " W"
						+ "\nConsumo total: " + consumoTotal + " W"
						+ "\nHoras de uso: " + horasDeUso + " h"
						+ "\nConsumo diário: " + consumoTotalDiarioW + " W/dia");
			}
		});
		btnVerificarValores.setBounds(10, 227, 159, 23);
		frmEquipamento.getContentPane().add(btnVerificarValores);
	}
	
	// Overload
	public Equipamento(Cadastro todosOsEquipamentos) {
		initialize(todosOsEquipamentos);
	}
	
	private void initialize(Cadastro todosOsEquipamentos) {		
		frmEquipamento = new JFrame();
		frmEquipamento.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				textFieldConsumoUnitario.setText(Integer.toString(todosOsEquipamentos.getConsumoUnitario()));
				textFieldHorasUso.setText(Integer.toString(todosOsEquipamentos.getTempoDeUsoDiario()));
				textFieldNome.setText(todosOsEquipamentos.getNomeEquipamento());
				textFieldQuantidade.setText(Integer.toString(todosOsEquipamentos.getQuantidadeDeEquipamento()));
			}
		});
		frmEquipamento.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\equipResid.jpg"));
		frmEquipamento.setTitle("Equipamento");
		frmEquipamento.setBounds(100, 100, 333, 300);
		frmEquipamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEquipamento.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(26, 10, 119, 14);
		frmEquipamento.getContentPane().add(lblNewLabel);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidade.setBounds(26, 36, 119, 14);
		frmEquipamento.getContentPane().add(lblQuantidade);
		
		JLabel lblConsumo = new JLabel("Consumo unit\u00E1rio:");
		lblConsumo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConsumo.setBounds(10, 61, 135, 14);
		frmEquipamento.getContentPane().add(lblConsumo);
		
		JLabel lblHorasDeUso = new JLabel("Horas de uso por dia:");
		lblHorasDeUso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHorasDeUso.setBounds(10, 86, 135, 14);
		frmEquipamento.getContentPane().add(lblHorasDeUso);
		
		textFieldQuantidade = new JTextField();
		textFieldQuantidade.setColumns(10);
		textFieldQuantidade.setBounds(155, 29, 86, 20);
		frmEquipamento.getContentPane().add(textFieldQuantidade);
		
		textFieldConsumoUnitario = new JTextField();
		textFieldConsumoUnitario.setColumns(10);
		textFieldConsumoUnitario.setBounds(155, 55, 86, 20);
		frmEquipamento.getContentPane().add(textFieldConsumoUnitario);
		
		textFieldHorasUso = new JTextField();
		textFieldHorasUso.setColumns(10);
		textFieldHorasUso.setBounds(155, 80, 86, 20);
		frmEquipamento.getContentPane().add(textFieldHorasUso);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEquipamento.dispose();
			}
		});
		btnCancelar.setBounds(218, 227, 89, 23);
		frmEquipamento.getContentPane().add(btnCancelar);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome = textFieldNome.getText();
				quantidade = Integer.parseInt(textFieldQuantidade.getText());
				consumoUnitario = Integer.parseInt(textFieldConsumoUnitario.getText());
				consumoTotal = quantidade * consumoUnitario;
				horasDeUso = Integer.parseInt(textFieldHorasUso.getText());
				consumoTotalDiarioW = consumoTotal * horasDeUso;
				frmEquipamento.dispose();
			}
		});
		btnOk.setBounds(218, 193, 89, 23);
		frmEquipamento.getContentPane().add(btnOk);
		
		textFieldNome = new JTextField();
		textFieldNome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				String nomeDois = textFieldNome.getText();
				frmEquipamento.setTitle(nomeDois);
			}
		});
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(155, 4, 86, 20);
		frmEquipamento.getContentPane().add(textFieldNome);
		
		JButton btnVerificarValores = new JButton("Verificar valores");
		btnVerificarValores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nome = textFieldNome.getText();
				quantidade = Integer.parseInt(textFieldQuantidade.getText());
				consumoUnitario = Integer.parseInt(textFieldConsumoUnitario.getText());
				consumoTotal = quantidade * consumoUnitario;
				horasDeUso = Integer.parseInt(textFieldHorasUso.getText());
				consumoTotalDiarioW = consumoTotal * horasDeUso;
				
				JOptionPane.showMessageDialog(null, "Nome: " + nome 
						+ "\nQuantidade: " + quantidade
						+ "\nConsumo unitário: " + consumoUnitario + " W"
						+ "\nConsumo total: " + consumoTotal + " W"
						+ "\nHoras de uso: " + horasDeUso + " h"
						+ "\nConsumo diário: " + consumoTotalDiarioW + " W/dia");
			}
		});
		btnVerificarValores.setBounds(10, 227, 159, 23);
		frmEquipamento.getContentPane().add(btnVerificarValores);
	}
}
