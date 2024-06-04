package ex1;

public class Setor_de_RH extends Departamento_Financeiro{
	
	private int numeroFuncionarios;
	
	public Setor_de_RH() {
		super();
	}
	
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Número de funcionários: " + numeroFuncionarios);
	}
	

}
