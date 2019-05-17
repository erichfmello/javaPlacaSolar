package Controladores;

import javax.swing.JOptionPane;

public class DadosControladorDeCarga {
	private String fabricante;
	private String modelo;
	private double tensao;
	private double correnteControlador;
	private double correnteNecessaria;
	private int quantidade;
	
	public DadosControladorDeCarga(String fabricante, String modelo, double tensao, double correnteControlador, double correnteCalculada) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tensao = tensao;
		this.correnteControlador = correnteControlador;
		
		correnteNecessaria = correnteCalculada / tensao;
		this.quantidade = (int)((correnteNecessaria / correnteControlador) + 1);
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public double getTensao() {
		return tensao;
	}

	public double getCorrenteControlador() {
		return correnteControlador;
	}

	public double getCorrenteNecessaria() {
		return correnteNecessaria;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setTensao(double tensao, double correnteCalculada) {
		this.tensao = tensao;
		correnteNecessaria = correnteCalculada / tensao;
		this.quantidade = (int)(correnteNecessaria / correnteControlador + 1);
	}

	public void setCorrenteControlador(double correnteControlador) {
		this.correnteControlador = correnteControlador;
		this.quantidade = (int)(correnteNecessaria / correnteControlador + 1);
	}

	@Override
	public String toString() {
		return "Controlador de carga"
				+ "\nFabricante: " + getFabricante()
				+ "\nModelo: " + getModelo()
				+ "\nTensão do controlador: " + getTensao() + " V"
				+ "\nCorrente do controlador: " + getCorrenteControlador() + " A"
				+ "\nQuantidade de controladores: " + quantidade;
	}
	
	public void imprimirDados() {
		JOptionPane.showMessageDialog(null, toString());
	}
}