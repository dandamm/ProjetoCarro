
public class AppCarro {

	public static void main(String[] args) {
		
		Automovel meuFusquinha = new Automovel("Fusca 67");
		meuFusquinha.setNumeroPortas(2);
		meuFusquinha.setNumeroRodas(4);
		meuFusquinha.setCor("Vermelha");
		
		System.out.println(Automovel.MARCA); //é possível fazer um valor estático
		
		System.out.println("O modelo do " + Automovel.DOMINIO + " é: " + meuFusquinha.getModelo());
		System.out.println("O automóvel tem " + meuFusquinha.getNumeroPortas() +" portas");
		System.out.println("O automóvel tem " + meuFusquinha.getNumeroRodas() +" rodas");
		System.out.println("O automóvel tem a cor " + meuFusquinha.getCor());
	}

}
