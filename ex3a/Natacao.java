package ex3a;

public class Natacao extends Atividade{
	
	private int tamanhoPiscina;

	public int getTamanhoPiscina() {
		return tamanhoPiscina;
	}

	public void setTamanhoPiscina(int tamanhoPiscina) {
		this.tamanhoPiscina = tamanhoPiscina;
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Nome do Instrutor: " + getNomeInstrutor());
		System.out.println("Horário: " + getHorario());
		System.out.println("Tamanho da piscina: " + tamanhoPiscina + "m");
		
	}

}
