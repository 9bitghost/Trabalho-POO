package ex3b;

public class Main {
	public static void main(String[] args) {
		EquipeSerieC equipe1 = new EquipeSerieC("Náutico", " Eládio de Barros Carvalho");
		EquipeSerieC equipe2 = new EquipeSerieC("São José", "Passo d'Areia");
		EquipeSerieC equipe3 = new EquipeSerieC("Caxias", "Centenário");
		
		equipe1.adicionarPontos(2);
		equipe2.adicionarPontos(1);
		
		equipe1.exibirInfos();
		equipe2.exibirInfos();
		equipe3.exibirInfos();
	}

}
