package paineis;
import javax.swing.JOptionPane;
 
 
public class TesteDeDimensionamentoErich {
	public static void main(String[] args) {
		// Declara��o das vari�veis de entrada de dados
		int horasDeInsolacao;
		double potenciaTotalDia;
		
		// Declara��o das vari�veis da bateria
		String fabricanteBateria;
		String nomeBateria;
		double tensaoBateria = 0;
		
		// Declarea��o das vari�veis do Painel
		double tensaoPainel;
		double correntePainel;
		double potenciaPainel;
		
		// Declara��o das vari�veis de controle
		String controlador;
		String revisor;
		String alteradorDeDados;
		String escolha;
		
		//Cria��o dos objetos
		DadosResidenciais entradaDeDados = null;
		DadosDaBateria bateria = null;
		CalculosPaineisSolares painelDimenisonamento = null;
		
		// Inicio do programa
		do {
			controlador = JOptionPane.showInputDialog("Escolha a op��o desejada:"
					+ "\n\n1 - Estrada de dados da residencia"
					+ "\n2 - Cadastrar Bateria"
					+ "\n3 - Cadastrar Painel Solar"
					+ "\n4 - Extrair relat�rio"
					+ "\n\n9 - Sair");
			
			switch (controlador) {
			case "1":
				potenciaTotalDia = Double.parseDouble(JOptionPane.showInputDialog("Qual o consumo por dia?"));
				horasDeInsolacao = Integer.parseInt(JOptionPane.showInputDialog("Qual a m�dia di�ria de insola��o?"));
				entradaDeDados = new DadosResidenciais(horasDeInsolacao, potenciaTotalDia);
				
				do {
					entradaDeDados.imprimirDados();
					revisor = JOptionPane.showInputDialog("Os dados est�o corretos?"
							+ "\n\n1 - Sim"
							+ "\n2 - N�o");

					switch (revisor) {
					case "1":
						revisor = "1";
						break;
					case "2":
						alteradorDeDados = JOptionPane.showInputDialog("Qual dado est� incorreto?"
								+ "\n\n1 - Wp = " + entradaDeDados.getPotenciaTotalDia() + " W/dia"
								+ "\n2 - td = " + entradaDeDados.getHorasDeInsolacao() + " horas");
						switch (alteradorDeDados) {
						case "1":
							potenciaTotalDia = Double.parseDouble(JOptionPane.showInputDialog("Qual o consumo por dia?"));
							entradaDeDados.setPotenciaTotalDia(potenciaTotalDia);
							break;
						case "2":
							horasDeInsolacao = Integer.parseInt(JOptionPane.showInputDialog("Qual a m�dia di�ria de insola��o?"));
							entradaDeDados.setHorasDeInsolacao(horasDeInsolacao);
							break;
						default:
							JOptionPane.showMessageDialog(null, "Op��o inv�lida");
							break;
						}
						break;
					default:
						JOptionPane.showMessageDialog(null, "Op��o inv�lido");
						break;
					}
				} while (revisor != "1");
				break;
			
			case "2":
				fabricanteBateria = JOptionPane.showInputDialog("Qual o nome da fabricante da bateria?");
				nomeBateria = JOptionPane.showInputDialog("Qual o nome da bateria?");
				tensaoBateria = Double.parseDouble(JOptionPane.showInputDialog("Qual a tens�o da bateria?"));
				bateria = new DadosDaBateria(fabricanteBateria, nomeBateria, tensaoBateria);

				do {
					bateria.imprimirDados();
					revisor = JOptionPane.showInputDialog("Os dados est�o corretos?"
							+ "\n\n1 - Sim"
							+ "\n2 - N�o");

					switch (revisor) {
					case "1":
						revisor = "1";
						break;
					case "2":
						alteradorDeDados = JOptionPane.showInputDialog("Qual dado est� incorreto?"
								+ "\n\n1 - Fabricante: " + bateria.getFabricanteBateria()
								+ "\n2 - Nome da bateria: " + bateria.getNomeBateria()
								+ "\n3 - Tens�o = " + bateria.getTensaoBateria() + " V");
						switch (alteradorDeDados) {
						case "1":
							fabricanteBateria = JOptionPane.showInputDialog("Qual o consumo por dia?");
							bateria.setFabricanteBateria(fabricanteBateria);
							break;
						case "2":
							nomeBateria = JOptionPane.showInputDialog("Qual o nome da bateria?");
							bateria.setNomeBateria(nomeBateria);
							break;
						case "3":
							tensaoBateria = Integer.parseInt(JOptionPane.showInputDialog("Qual a tens�o da bateria?"));
							bateria.setTensaoBateria(tensaoBateria);
							break;
						default:
							JOptionPane.showMessageDialog(null, "Op��o inv�lida");
							break;
						}
						break;
					default:
						JOptionPane.showMessageDialog(null, "Op��o inv�lido");
						break;
					}
				} while (revisor != "1");

				break;

			case "3":
				do {
					escolha = JOptionPane.showInputDialog("Escolha a op��o desejada:"
							+ "\n\n1 - Calcular Painel fornecendo a pot�ncia"
							+ "\n2 - Calcular Painel fornecendo a tens�o e corrente");
					
					switch (escolha) {
					case "1":
						potenciaPainel = Double.parseDouble(JOptionPane.showInputDialog("Qual a pot�ncia do painel?"));
						//painelDimenisonamento = new CalculosPaineisSolares(potenciaPainel, tensaoBateria, entradaDeDados);
												
						do {
							painelDimenisonamento.imprimirDados();
							revisor = JOptionPane.showInputDialog("Os dados est�o corretos?"
									+ "\n\n1 - Sim"
									+ "\n2 - N�o");
							
							switch (revisor) {
							case "1":
								revisor = "1";
								break;
							
							case "2":
								alteradorDeDados = JOptionPane.showInputDialog("Qual dado est� incorreto?"
										+ "\n\n1 - Pot�ncia = " + painelDimenisonamento.getPotenciaPainel() + " W");
								switch (alteradorDeDados) {
								case "1":
									potenciaPainel = Double.parseDouble(JOptionPane.showInputDialog("Qual a pot�ncia do painel?"));
									painelDimenisonamento.setPotenciaPainel(potenciaPainel);
									break;

								default:
									JOptionPane.showMessageDialog(null, "Op��o inv�lido");
									break;
								}
								break;
							default:
								break;
							}
						} while (revisor != "1");
						break;
					
					case "2":
						tensaoPainel = Double.parseDouble(JOptionPane.showInputDialog("Qual a tens�o do painel?"));
						correntePainel = Double.parseDouble(JOptionPane.showInputDialog("Qual a corrente do painel?"));
						//painelDimenisonamento = new CalculosPaineisSolares(tensaoPainel, correntePainel, tensaoBateria, entradaDeDados);
						
						do {
							painelDimenisonamento.imprimirDados();
							revisor = JOptionPane.showInputDialog("Os dados est�o corretos?"
									+ "\n\n1 - Sim"
									+ "\n2 - N�o");
							
							switch (revisor) {
							case "1":
								revisor = "1";
								break;
								
							case "2":
								alteradorDeDados = JOptionPane.showInputDialog("Qual dado est� incorreto?"
										+ "\n\n1 - tens�o = " + painelDimenisonamento.getTensaoPainel() + " V"
										+ "\n2 - Corrente = " + painelDimenisonamento.getCorrentePainel() + " A");
								switch (alteradorDeDados) {
								case "1":
									tensaoPainel = Double.parseDouble(JOptionPane.showInputDialog("Qual a tens�o do painel?"));
									painelDimenisonamento.setTensaoPainel(tensaoPainel);
									break;
								case "2":
									correntePainel = Double.parseDouble(JOptionPane.showInputDialog("Qual a corrente do painel?"));
									painelDimenisonamento.setCorrentePainel(correntePainel);
									break;
								default:
									JOptionPane.showMessageDialog(null, "Op��o inv�lido");
									break;
								}								
								break;
								
							default:
								JOptionPane.showMessageDialog(null, "Op��o inv�lido");
								break;
							}
						} while (revisor != "1");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Op��o inv�lido");
						break;
					}
				} while (escolha == "1" || escolha == "2");
				break;	
			case "4":
				entradaDeDados.imprimirDados();
				bateria.imprimirDados();
				painelDimenisonamento.imprimirDados();
				
				break;
			case "9":
				controlador = "9";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lido");
				break;
			}
			
		} while (controlador != "9");
	}
}
