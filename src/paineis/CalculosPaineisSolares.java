package paineis;
import javax.swing.JOptionPane;

public class CalculosPaineisSolares extends DadosPaineisSolares {
	private double potenciaDeFato;
	private double perdaDePotencia;
	private double numeroDePaineis;
	private double reservaDeEnergia;
	
	public CalculosPaineisSolares(double tensaoPainel, double correntePainel, double tensaoBateria, double potenciaTotalHora) {
		
		super(tensaoPainel, correntePainel);
		
		this.potenciaDeFato = tensaoBateria * correntePainel;
		this.perdaDePotencia = getPotenciaPainel() - potenciaDeFato;
		this.numeroDePaineis = (int)((potenciaTotalHora / potenciaDeFato) + 1);
		
		this.reservaDeEnergia = numeroDePaineis * potenciaDeFato - potenciaTotalHora;
	}
	
	// Metodo a remover
	public CalculosPaineisSolares(double potenciaPainel, double tensaoBateria, int potenciaTotalHora) {
		super (potenciaPainel);
		
		this.potenciaDeFato = getPotenciaPainel();
		this.perdaDePotencia = getPotenciaPainel() - potenciaDeFato;
		
		this.numeroDePaineis = ((potenciaTotalHora / potenciaDeFato) + 1);
		this.reservaDeEnergia = numeroDePaineis * potenciaDeFato - potenciaTotalHora;
	}

	public double getPotenciaDeFato() {
		return potenciaDeFato;
	}

	public double getPerdaDePotencia() {
		return perdaDePotencia;
	}

	public double getNumeroDePaineis() {
		return numeroDePaineis;
	}

	public double getReservaDeEnergia() {
		return reservaDeEnergia;
	}

	@Override
	public String toString() {
		return super.toString()
				+ "\nPot�ncia de fato = " + getPotenciaDeFato() + " W"
				+ "\nPerdas = " + getPerdaDePotencia() + " %"
				+ "\nN�mero de pain�is = " + getNumeroDePaineis()
				+ "\nReserva de energia Gerada = " + getReservaDeEnergia() + " W";
	}
	
	public void imprimirDados() {
		JOptionPane.showMessageDialog(null, toString());
	}
}
