package Cinemas;

public class Cine_Roxy extends Cinemas_de_Santos {

    Cine_Roxy() {
        setlocalizacao("Av. Ana Costa - Gonzaga");
        System.out.println("Cine Roxy está localizado:\t" + getlocalizacao());
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Informações do Cine Roxy:");
        super.mostrarInformacoes();
    }
}