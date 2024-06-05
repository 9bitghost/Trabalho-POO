package Cinemas;

public class Cinemas_de_Santos {
    private String localizacao;

    public void setlocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getlocalizacao() {
        return localizacao;
    }

    public void mostrarInformacoes() {
        System.out.println("Localização do cinema: " + localizacao);
    }
}
