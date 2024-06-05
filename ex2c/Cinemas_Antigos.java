package Cinemas;

public class Cinemas_Antigos extends Cinemas_de_Santos {
    private String nome_do_cinema;

    Cinemas_Antigos(String antigo) {
        System.out.println("História dos Cinemas de Santos\n");
    }

    public void setnome(String nome_do_cinema) {
        this.nome_do_cinema = nome_do_cinema;
    }

    public String getnome() {
        return nome_do_cinema;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do cinema antigo: " + nome_do_cinema);
    }
}