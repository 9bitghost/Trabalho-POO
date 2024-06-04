package ex1;

public class Departamento_Financeiro extends Rede_de_Hotelaria{
	private double orcamento;
	
	public Departamento_Financeiro() {
		super();
	}

	public double getOrcamento() {
		return orcamento;
	}
	
	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Hotel: " + getNomeHotel());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Orçamento: " + orcamento);
	}

}
