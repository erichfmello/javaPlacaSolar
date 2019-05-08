package cadastros;

import javax.swing.JOptionPane;

public class Cadastro extends Equipamentos {
    private int quantidadeDeEquipamento;
    private int consumoUnitario;
    private int tempoDeUsoDiario;
    private int consumoTotal;
    private int consumoDiarioW;
	
    public Cadastro(String nomeEquipamento, int quantidadeDeEquipamento, int consumoUnitario, int tempoDeUsoDiario) {
		this.setNomeEquipamento(nomeEquipamento);
		this.quantidadeDeEquipamento = quantidadeDeEquipamento;
		this.consumoUnitario = consumoUnitario;
		this.tempoDeUsoDiario = tempoDeUsoDiario;
	}

	public int getQuantidadeDeEquipamento() {
		return quantidadeDeEquipamento;
	}

	public int getConsumoUnitario() {
		return consumoUnitario;
	}

	public int getTempoDeUsoDiario() {
		return tempoDeUsoDiario;
	}

	public void setQuantidadeDeEquipamento(int quantidadeDeEquipamento) {
		this.quantidadeDeEquipamento = quantidadeDeEquipamento;
	}

	public void setConsumoUnitario(int consumoUnitario) {
		this.consumoUnitario = consumoUnitario;
	}
	
	public void setTempoDeUsoDiario(int tempoDeUsoDiario) {
		this.tempoDeUsoDiario = tempoDeUsoDiario;
	}
	
	/**/
	public int calculoConsumoTotal() {
		consumoTotal = quantidadeDeEquipamento * consumoUnitario;
		return consumoTotal;
	}
	
	public int calculoConsumoDiarioW() {
		consumoDiarioW = consumoTotal * tempoDeUsoDiario;
		return  consumoDiarioW;
	}
	
	public void apagar() {
		quantidadeDeEquipamento = 0;
	    consumoUnitario = 0;
	    tempoDeUsoDiario = 0;
	    consumoTotal = 0;
	    consumoDiarioW = 0;
	    return;
	}

	@Override
	public String toString() {
		return "Nome do equipamento: " + getNomeEquipamento()
			+ "\nQuantidade = " + getQuantidadeDeEquipamento()
			+ "\nConsumo unitário = " + getConsumoUnitario() + " W"
			+ "\nConsumo total = " + consumoTotal + " W"
			+ "\nTempo de uso = " + getTempoDeUsoDiario() + " h"
			+ "\nConsumo diário = " + consumoDiarioW + " W/dia";
	}
	
	public void imprimirDados() {
		JOptionPane.showMessageDialog(null, toString());
	}
}
