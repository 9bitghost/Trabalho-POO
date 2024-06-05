package Cinemas;

public class Consulta_Cinemas {
    public static void main(String args[]) {
        Cine_Roxy roxy = new Cine_Roxy();
        Cine_Caiçara caicara = new Cine_Caiçara("Antigo cinema da\n" + "Av. Conselheiro Nébias - Boqueirão");

        caicara.setlocalizacao("Avenida Conselheiro Nébias com a Praia");
        caicara.setnome("Cine Caiçara");
        System.out.println("Cine \t" + caicara.getnome() + "\nficava na esquina da:\t" + caicara.getlocalizacao());
    }

    System.out.println("\nAqui estão as informações sobre os cinemas:\n");
    roxy.mostrarInformacoes();
    caicara.mostrarInformacoes();
}
}