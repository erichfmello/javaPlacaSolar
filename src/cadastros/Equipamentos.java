package cadastros;

public abstract class Equipamentos {
	private String nomeEquipamento;

	public String getNomeEquipamento() {
		return nomeEquipamento;
	}

	public void setNomeEquipamento(String nomeEquipamento) {
		this.nomeEquipamento = nomeEquipamento;
	}
	
	public abstract int calculoConsumoTotal();
	public abstract int calculoConsumoDiarioW();
	public abstract void imprimirDados();
}
