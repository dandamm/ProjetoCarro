
public class AppCarro {

	public static void main(String[] args) {
		
		Automovel meuFusquinha = new Automovel("Fusca 67");
		meuFusquinha.setNumeroPortas(2);
		meuFusquinha.setNumeroRodas(4);
		meuFusquinha.setCor("Vermelha");
		
		System.out.println(Automovel.MARCA); //� poss�vel fazer um valor est�tico
		
		System.out.println("O modelo do " + Automovel.DOMINIO + " �: " + meuFusquinha.getModelo());
		System.out.println("O autom�vel tem " + meuFusquinha.getNumeroPortas() +" portas");
		System.out.println("O autom�vel tem " + meuFusquinha.getNumeroRodas() +" rodas");
		System.out.println("O autom�vel tem a cor " + meuFusquinha.getCor());
	}

}
