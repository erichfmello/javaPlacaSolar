import javax.swing.JOptionPane;

public class DadosResidenciais {
	private int horasDeInsolacao;
	private double potenciaTotalHora;
	private double potenciaTotalDia;
	
	
	public DadosResidenciais(int horasDeInsolacao, double potenciaTotalDia) {
		this.horasDeInsolacao = horasDeInsolacao;
		this.potenciaTotalDia = potenciaTotalDia;
		this.potenciaTotalHora = potenciaTotalDia / horasDeInsolacao;
	}

	public int getHorasDeInsolacao() {
		return horasDeInsolacao;
	}


	public void setHorasDeInsolacao(int horasDeInsolacao) {
		this.horasDeInsolacao = horasDeInsolacao;
		this.potenciaTotalHora = potenciaTotalDia / horasDeInsolacao;
	}
	
	public double getPotenciaTotalDia() {
		return potenciaTotalDia;
	}


	public void setPotenciaTotalDia(double potenciaTotalDia) {
		this.potenciaTotalDia = potenciaTotalDia;
		this.potenciaTotalHora = potenciaTotalDia / horasDeInsolacao;
	}
	
	public double getPotenciaTotalHora() {
		return potenciaTotalHora;
	}

	@Override
	public String toString() {
		return "Wp = " + getPotenciaTotalDia() + " W/dia"
				+ "\nPth = " + getPotenciaTotalHora() + " W/hora"
				+ "\ntd = " + getHorasDeInsolacao() + " horas";
	}
	
	public void imprimirDados() {
		JOptionPane.showMessageDialog(null, toString());
	}
	
	
}
