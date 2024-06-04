package ex3a;

public class Musculacao extends Atividade{
	
	private int numeroAparelhos;

	public int getNumeroAparelhos() {
		return numeroAparelhos;
	}

	public void setNumeroAparelhos(int numeroAparelhos) {
		this.numeroAparelhos = numeroAparelhos;
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Nome do Instrutor: " + getNomeInstrutor());
		System.out.println("Horário: " + getHorario());
		System.out.println("Número de aparelhos: " + numeroAparelhos);
		
	}

}
