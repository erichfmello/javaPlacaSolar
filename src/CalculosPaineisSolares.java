import javax.swing.JOptionPane;

public class CalculosPaineisSolares extends DadosPaineisSolares {
	private double potenciaDeFato;
	private double perdaDePotencia;
	private double numeroDePaineis;
	private double reservaDeEnergia;
	
	public CalculosPaineisSolares(double tensaoPainel, double correntePainel, double tensaoBateria, DadosResidenciais potenciaTotalHora) {
		
		super(tensaoPainel, correntePainel);
		
		this.potenciaDeFato = tensaoBateria * correntePainel;
		this.perdaDePotencia = getPotenciaPainel() - potenciaDeFato;
		this.numeroDePaineis = (int)((potenciaTotalHora.getPotenciaTotalHora() / potenciaDeFato) + 1);
		
		this.reservaDeEnergia = numeroDePaineis * potenciaDeFato - potenciaTotalHora.getPotenciaTotalHora();
	}
	
	public CalculosPaineisSolares(double potenciaPainel, double tensaoBateria, DadosResidenciais potenciaTotalHora) {
		super (potenciaPainel);
		
		this.potenciaDeFato = getPotenciaPainel();
		this.perdaDePotencia = getPotenciaPainel() - potenciaDeFato;

		// Testes 
		potenciaTotalHora.imprimirDados();
		
		
		this.numeroDePaineis = ((potenciaTotalHora.getPotenciaTotalHora() / potenciaDeFato) + 1);
		
		this.reservaDeEnergia = numeroDePaineis * potenciaDeFato - potenciaTotalHora.getPotenciaTotalHora();
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
				+ "\nPotência de fato = " + getPotenciaDeFato() + " W"
				+ "\nPerdas = " + getPerdaDePotencia() + " %"
				+ "\nNúmero de painéis = " + getNumeroDePaineis()
				+ "\nReserva de energia Gerada = " + getReservaDeEnergia() + " W";
	}
	
	public void imprimirDados() {
		JOptionPane.showMessageDialog(null, toString());
	}
}
