package Cinemas;

public class Cine_Caiçara extends Cinemas_Antigos {

    Cine_Caiçara(String antigo) {
        super(antigo);
    }

    public void mostrarInformacoes() {
        System.out.println("Informações do Cine Caiçara:");
        super.mostrarInformacoes();
    }
}