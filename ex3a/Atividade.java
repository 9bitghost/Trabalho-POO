package ex3a;

public abstract class Atividade {
	private String nomeInstrutor;
	private String horario;
	
	public Atividade() {
		
	}
	
	public String getNomeInstrutor() {
		return nomeInstrutor;
	}
	
	public void setNomeInstrutor(String nomeInstrutor) {
		this.nomeInstrutor = nomeInstrutor;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public abstract void exibirInformacoes();

}
