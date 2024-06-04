package ex1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		int opt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para Setor de RH ou \n2 para Amoxarifado e Materiais"));
		
		if (opt == 1) {
			Setor_de_RH setorRH = new Setor_de_RH();
			
			setorRH.setNomeHotel(JOptionPane.showInputDialog(null, "Nome do Hotel"));
			setorRH.setEndereco(JOptionPane.showInputDialog(null, "Endereço"));
			setorRH.setOrcamento(Integer.parseInt(JOptionPane.showInputDialog(null, "Orçamento")));
			setorRH.setNumeroFuncionarios(Integer.parseInt(JOptionPane.showInputDialog(null, "Número de Funcionários")));
			
			setorRH.exibirInformacoes();
		}
		else if (opt == 2) {
		
			Almoxarifado_e_Materiais am = new Almoxarifado_e_Materiais();
			am.setNomeHotel(JOptionPane.showInputDialog(null, "Nome do Hotel"));
			am.setEndereco(JOptionPane.showInputDialog(null, "Endereço"));
			am.setOrcamento(Integer.parseInt(JOptionPane.showInputDialog(null, "Orçamento")));
			am.setQuantidadeMateriais(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de materiais")));
			
			am.exibirInformacoes();
		}
		else {
			System.out.println("Opção Inválida");
		}
	}

}
