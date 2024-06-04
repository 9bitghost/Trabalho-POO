package ex1;

public class Almoxarifado_e_Materiais extends Departamento_Financeiro{
	
	private int quantidadeMateriais;
	
	public Almoxarifado_e_Materiais() {
		super();
	}
	
	public int getQuantidadeMateriais() {
		return quantidadeMateriais;
	}
	
	public void setQuantidadeMateriais(int quantidadeMateriais) {
		this.quantidadeMateriais = quantidadeMateriais;
	}
	
	@Override
	public void exibirInformacoes(){
		super.exibirInformacoes();
		System.out.println("Quantidade de materiais: " + quantidadeMateriais);
	}
	
}
