package Tipagem_1;

public class Biblioteca_Informática extends Biblioteca_Central {
	
	protected String livro_informática;
	protected String editora_informática;
	
	Biblioteca_Informática(String livro_informática, String editora_informática) {
		super(livro_informática, editora_informática);
		this.livro_informática = livro_informática;
		this.editora_informática = editora_informática;	
		}

	public String getLivro_informática() {
		return livro_informática;
	}

	public String getEditora_informática() {
		return editora_informática;
	}
}
