
public class AppCarro {

	public static void main(String[] args) {
		
		Automovel meuFusquinha = new Automovel("Fusca 67");
		meuFusquinha.setNumeroPortas(2);
		meuFusquinha.setNumeroRodas(4);
		meuFusquinha.setCor("Vermelha");
		
		System.out.println(Automovel.MARCA); //é possível fazer um valor estático
		
		System.out.println(Mensagens.MENSAGEM_AO_BUSCAR_MODELO + meuFusquinha.getModelo());
		System.out.println(Mensagens.MENSAGEM_AO_BUSCAR_NUMERO_PORTAS + meuFusquinha.getNumeroPortas());
		System.out.println(Mensagens.MENSAGEM_AO_BUSCAR_NUMERO_RODAS + meuFusquinha.getNumeroRodas());
		System.out.println(Mensagens.MENSAGEM_AO_BUSCAR_COR + meuFusquinha.getCor());
	}

}
