package Tipagem_1;
import javax.swing.*;

public class Interface_Biblioteca {
	
	String m, n;
	
	public Biblioteca_Central livro(){
		
		m = JOptionPane.showInputDialog("Digitar nome do livro: ");
		n = JOptionPane.showInputDialog("Digitar nome da editora: ");
		int tipo_livro = Integer.parseInt(JOptionPane.showInputDialog("Geral = 1\nInformática = 2\nBiologia = 3\nHistória e Geografia = 4"));
	
		if (tipo_livro == 1)
			return new Biblioteca_Central(m,n);
		
		else if (tipo_livro == 2)
			return new Biblioteca_Informática(m,n);
		
		else if (tipo_livro == 3)
			return new Biblioteca_Biologia(m,n);
		
		else if (tipo_livro == 4)
			return new Biblioteca_HistóriaGeografia(m,n);
		
		else
			return null;	
	}
	
	public void livraria(Biblioteca a) {
		if (a instanceof Biblioteca_Informática)
			System.out.println("Livro é de informática. \nLivro: " + ((Biblioteca_Informática)a).getLivro_informática() + "\nEditora: " +
		((Biblioteca_Informática)a).getEditora_informática());
		else if (a instanceof Biblioteca_Biologia)
			System.out.println("Livro é de biologia. \nLivro: " + ((Biblioteca_Biologia)a).getLivro_biologia() + "\nEditora: " +
		((Biblioteca_Biologia)a).getEditora_biologia());
		else if (a instanceof Biblioteca_HistóriaGeografia)
			System.out.println("Livro é de história/geografia. \nLivro: " + ((Biblioteca_HistóriaGeografia)a).getLivro_históriageografia() + "\nEditora: " +
		((Biblioteca_HistóriaGeografia)a).getEditora_históriageografia());
		else 
			System.out.println("Livro é geral. \nLivro: " + ((Biblioteca_Central)a).getLivro() + "\nEditora: " +
					((Biblioteca_Central)a).getEditora());
	}
}
