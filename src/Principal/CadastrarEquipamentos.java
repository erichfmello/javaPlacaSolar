package Principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;

public class CadastrarEquipamentos {
	
	public JFrame frmCadastroDeEquipamentos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarEquipamentos window = new CadastrarEquipamentos();
					window.frmCadastroDeEquipamentos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the application.
	 */
	public CadastrarEquipamentos() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeEquipamentos = new JFrame();
		frmCadastroDeEquipamentos.setTitle("Cadastro de equipamentos");
		frmCadastroDeEquipamentos.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\equipResid.jpg"));
		frmCadastroDeEquipamentos.setBounds(100, 100, 724, 517);
		frmCadastroDeEquipamentos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeEquipamentos.getContentPane().setLayout(null);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(609, 410, 89, 23);
		frmCadastroDeEquipamentos.getContentPane().add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(609, 444, 89, 23);
		frmCadastroDeEquipamentos.getContentPane().add(btnCancelar);
	}
}
