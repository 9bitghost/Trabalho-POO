package ex1;

public abstract class Rede_de_Hotelaria {
	private String nomeHotel;
	private String endereco;
	
	public Rede_de_Hotelaria() {
	}
	
	public String getNomeHotel() {
		return nomeHotel;
	}
	
	public void setNomeHotel(String nomeHotel) {
		this.nomeHotel = nomeHotel;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public abstract void exibirInformacoes();
	
}
