package Tipagem_1;

public class Biblioteca_Central extends Biblioteca {

		protected String título_livro;
		protected String editora_livro;
		
		Biblioteca_Central (String título_livro, String editora_livro) {

			this.título_livro = título_livro;
			this.editora_livro = editora_livro;
			
		}
		
		public String getLivro(){
			return título_livro;
			}
		
		public String getEditora() {
			return editora_livro;
			
			}
}
