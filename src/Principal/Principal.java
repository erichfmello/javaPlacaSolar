package Principal;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import paineis.CalculosPaineisSolares;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal {

	private JFrame frmPainisSolares;
	CadastrarEquipamentos cadastrarNovosEquipamentos = new CadastrarEquipamentos();
	PainelSolar dimensionar = new PainelSolar();
	public int wp = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmPainisSolares.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {		
		frmPainisSolares = new JFrame();
		frmPainisSolares.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				wp = 0;
				for(int i=0; i<cadastrarNovosEquipamentos.todosOsEquipamentos.length; i++) {
					wp = wp + (cadastrarNovosEquipamentos.todosOsEquipamentos[i].calculoConsumoDiarioW());
				}
			}
		});
		frmPainisSolares.setTitle("Pain\u00E9is solares");
		frmPainisSolares.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\placasSolares.jpg"));
		frmPainisSolares.setBounds(100, 100, 487, 232);
		frmPainisSolares.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPainisSolares.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar Equipamentos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarNovosEquipamentos.frmCadastroDeEquipamentos.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 11, 197, 23);
		frmPainisSolares.getContentPane().add(btnNewButton);
		
		JButton btnDimensionameno = new JButton("Dimensionameno");
		btnDimensionameno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (wp != 0) {
					dimensionar = new PainelSolar(wp);
					dimensionar.frmPaineisSolares.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "� necess�rio cadastrar os dados residenci�is!!!");					
				}
			}
		});
		btnDimensionameno.setBounds(10, 45, 197, 23);
		frmPainisSolares.getContentPane().add(btnDimensionameno);
		
		JButton btnImprimirResultados = new JButton("Imprimir resultados");
		btnImprimirResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Wp = " + wp + " W/dia");
				dimensionar.bateria.imprimirDados();
				dimensionar.cadastrarPaineis.dimensionamento.imprimirDados();
				dimensionar.controladoresDeCarga.controladoresDeCarga.imprimirDados();
			}
		});
		btnImprimirResultados.setBounds(10, 79, 197, 23);
		frmPainisSolares.getContentPane().add(btnImprimirResultados);
		
		JButton btnSobreOPrograma = new JButton("Sobre o programa");
		btnSobreOPrograma.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				SobreOPrograma sobre = new SobreOPrograma();
				sobre.frmSobreOProgrma.setVisible(true);
			}
		});
		btnSobreOPrograma.setBounds(10, 158, 197, 23);
		frmPainisSolares.getContentPane().add(btnSobreOPrograma);
		
		JLabel lblNewLabel = new JLabel("Cadastrar os equipamentos residenciais");
		lblNewLabel.setBounds(217, 14, 248, 14);
		frmPainisSolares.getContentPane().add(lblNewLabel);
		
		JLabel lblDimensionarOsPainis = new JLabel("Dimensionar os pain\u00E9is solares");
		lblDimensionarOsPainis.setBounds(217, 48, 248, 14);
		frmPainisSolares.getContentPane().add(lblDimensionarOsPainis);
		
		JLabel lblImprimirOsResultados = new JLabel("Imprimir os resultados calculados");
		lblImprimirOsResultados.setBounds(217, 82, 248, 14);
		frmPainisSolares.getContentPane().add(lblImprimirOsResultados);
	}
}
