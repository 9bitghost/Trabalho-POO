package Tipagem_1;

public class Biblioteca_HistóriaGeografia extends Biblioteca_Central {
	
	protected String livro_históriageografia;
	protected String editora_históriageografia;
	
	Biblioteca_HistóriaGeografia (String livro_históriageografia, String editora_históriageografia) {
		super(livro_históriageografia, editora_históriageografia);
		this.livro_históriageografia = livro_históriageografia;
		this.editora_históriageografia = editora_históriageografia;	
		}

	public String getLivro_históriageografia() {
		return livro_históriageografia;
	}

	public String getEditora_históriageografia() {
		return editora_históriageografia;
	}
}