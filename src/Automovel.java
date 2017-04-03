
public class Automovel {
	
	static final String marca = "Volks";//final nao deixa mudar o valor
	static String domonio = "Carro";
	private int numeroRodas, numeroPortas;
	private String cor, modelo;
	
	public Automovel(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public String getCor() {
		return cor;
	}
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public int getNumeroRodas() {
		return numeroRodas;
	}
	public void setNumeroPortas(int numeroPortas) {
		if(numeroPortas<1){
			System.out.println("Erro - Não pode ser criado com menos de uma porta!");
		}else{
			this.numeroPortas = numeroPortas;
		}
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
	//public static String getDominio(){
	//	return domonio;
    //} nao precisa usar isso, mas é possivel
}
