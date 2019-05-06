package paineis;
import javax.swing.JOptionPane;

public class DadosDaBateria {
	private String fabricanteBateria;
	private String nomeBateria;
	private double tensaoBateria;
	
	public DadosDaBateria(String fabricanteBateria, String nomeBateria, double tensaoBateria) {
		this.fabricanteBateria = fabricanteBateria;
		this.nomeBateria = nomeBateria;
		this.tensaoBateria = tensaoBateria;
	}


	public String getFabricanteBateria() {
		return fabricanteBateria;
	}

	public void setFabricanteBateria(String fabricanteBateria) {
		this.fabricanteBateria = fabricanteBateria;
	}

	public String getNomeBateria() {
		return nomeBateria;
	}
	
	public void setNomeBateria(String nomeBateria) {
		this.nomeBateria = nomeBateria;
	}
	
	public double getTensaoBateria() {
		return tensaoBateria;
	}

	public void setTensaoBateria(double tensaoBateria) {
		this.tensaoBateria = tensaoBateria;
	}

	@Override
	public String toString() {
		return "Fabricante da bateria: " + getFabricanteBateria() 
				+ "\nNome da Bateria: " + getNomeBateria()
				+ "\nTensão da bateria: " + getTensaoBateria() + " V";
	}
	
	public void imprimirDados() {
		JOptionPane.showMessageDialog(null, toString());
	}
	
	
}
