package Principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class SobreOPrograma {

	public JFrame frmSobreOProgrma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SobreOPrograma window = new SobreOPrograma();
					window.frmSobreOProgrma.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SobreOPrograma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSobreOProgrma = new JFrame();
		frmSobreOProgrma.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Erich\\Faculdade\\APS\\2\u00BA Semestre\\Imagens\\placasSolares.jpg"));
		frmSobreOProgrma.setTitle("Sobre o progrma");
		frmSobreOProgrma.setBounds(100, 100, 307, 208);
		frmSobreOProgrma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSobreOProgrma.getContentPane().setLayout(null);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmSobreOProgrma.dispose();
			}
		});
		btnOk.setBounds(192, 135, 89, 23);
		frmSobreOProgrma.getContentPane().add(btnOk);
		
		JLabel lblErichFurmankiewiczDe = new JLabel("Alex Junior Valerio Moreira");
		lblErichFurmankiewiczDe.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblErichFurmankiewiczDe.setBounds(10, 11, 181, 14);
		frmSobreOProgrma.getContentPane().add(lblErichFurmankiewiczDe);
		
		JLabel lblMatheusDaSilva = new JLabel("Erich Furmankiewicz de Mello");
		lblMatheusDaSilva.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMatheusDaSilva.setBounds(10, 36, 181, 14);
		frmSobreOProgrma.getContentPane().add(lblMatheusDaSilva);
		
		JLabel lblMatheusDaSilva_1 = new JLabel("Matheus da Silva");
		lblMatheusDaSilva_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMatheusDaSilva_1.setBounds(10, 61, 181, 14);
		frmSobreOProgrma.getContentPane().add(lblMatheusDaSilva_1);
		
		JLabel label_2 = new JLabel("Erich Furmankiewicz de Mello");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(10, 86, 181, 14);
		frmSobreOProgrma.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Erich Furmankiewicz de Mello");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(10, 111, 181, 14);
		frmSobreOProgrma.getContentPane().add(label_3);
		
		JLabel lblRaTf = new JLabel("R.A.: N3482-91");
		lblRaTf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRaTf.setBounds(201, 11, 181, 14);
		frmSobreOProgrma.getContentPane().add(lblRaTf);
		
		JLabel lblRaDggf = new JLabel("R.A.: T7649-F9");
		lblRaDggf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRaDggf.setBounds(201, 36, 181, 14);
		frmSobreOProgrma.getContentPane().add(lblRaDggf);
		
		JLabel lblRaDggf_1 = new JLabel("R.A.: D53GG-F0");
		lblRaDggf_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRaDggf_1.setBounds(201, 61, 181, 14);
		frmSobreOProgrma.getContentPane().add(lblRaDggf_1);
		
		JLabel label_6 = new JLabel("R.A.: T7649-F9");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(201, 86, 181, 14);
		frmSobreOProgrma.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("R.A.: T7649-F9");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(201, 111, 181, 14);
		frmSobreOProgrma.getContentPane().add(label_7);
	}
}
