package ex3b;

public class EquipeSerieC implements Equipe{
	
	private String nome;
	private String estadio;
	private int pontos;
	
	public EquipeSerieC(String nome, String estadio){
		this.nome = nome;
		this.estadio = estadio;
		this.pontos = 0;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	@Override
	public void adicionarPontos(int pontos) {
		this.pontos += pontos;
		
	}

	@Override
	public void exibirInfos() {
		System.out.println("Equipe: " + nome);
		System.out.println("Estádio: " + estadio);
		System.out.println("Pontuação: " + pontos);
		
	}
	
}
