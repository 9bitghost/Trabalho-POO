package ex3a;

public class Main {
	public static void main(String[] args) {
		Musculacao musculacao = new Musculacao();
		
		musculacao.setNomeInstrutor("João");
		musculacao.setHorario("12:00");
		musculacao.setNumeroAparelhos(30);
		
		musculacao.exibirInformacoes();
		
		Natacao natacao = new Natacao();
		
		natacao.setNomeInstrutor("José");
		natacao.setHorario("14:30");
		natacao.setTamanhoPiscina(500);
		
		natacao.exibirInformacoes();
	}

}
