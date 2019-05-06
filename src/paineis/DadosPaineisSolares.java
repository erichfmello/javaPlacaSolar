package paineis;
import javax.swing.JOptionPane;

public class DadosPaineisSolares {
	private double tensaoPainel = 0;
	private double correntePainel = 0;
	private double potenciaPainel;
	
	public DadosPaineisSolares(double tensaoPainel, double correntePainel) {
		this.tensaoPainel = tensaoPainel;
		this.correntePainel = correntePainel;
		this.potenciaPainel = tensaoPainel * correntePainel;
	}
	
	public DadosPaineisSolares(double potenciaPainel) {
		this.potenciaPainel = potenciaPainel;
	}

	public double getTensaoPainel() {
		return tensaoPainel;
	}

	public void setTensaoPainel(double tensaoPainel) {
		this.tensaoPainel = tensaoPainel;
		this.potenciaPainel = tensaoPainel * correntePainel;
	}

	public double getCorrentePainel() {
		return correntePainel;
	}

	public void setCorrentePainel(double correntePainel) {
		this.correntePainel = correntePainel;
		this.potenciaPainel = tensaoPainel * correntePainel;
	}

	public double getPotenciaPainel() {
		return potenciaPainel;
	}

	public void setPotenciaPainel(double potenciaPainel) {
		this.potenciaPainel = potenciaPainel;
	}

	@Override
	public String toString() {
		if (this.correntePainel == 0 && this.tensaoPainel == 0) {
			return "Dados do Painel:"
					+ "\nPotência do painel = " + getPotenciaPainel() + " W";
		} else {
			return "Dados do Painel:"
					+ "\n\nTensão = " + getTensaoPainel() + " V"
					+ "\nCorrente = " + getCorrentePainel() + " A"
					+ "\nPotência do painel = " + getPotenciaPainel() + " W";			
		}
	}
	
	public void imprimirDados() {
		JOptionPane.showMessageDialog(null, toString());
	}
}
