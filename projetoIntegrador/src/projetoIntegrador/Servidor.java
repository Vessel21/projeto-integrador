package projetoIntegrador;

public class Servidor {
	public static void main(String[] args) {
		Ativos pessoa1 = new Ativos(null, null, null, 0);
		LupaAtivo infopessoa1 = new LupaAtivo(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Ativos pessoa2 = new Ativos(null, null, null, 0);
		LupaAtivo infopessoa2 = new LupaAtivo(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		//mais exemplos de ativos
		
		Ativos pessoa3 = new Inativos(null, null, null, 0);
		LupaAtivo infopessoa3 = new LupaInativos(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Ativos pessoa4 = new Inativos(null, null, null, 0);
		LupaAtivo infopessoa4 = new LupaInativos(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		//mais exemplos de inativos
	
		pessoa1.toString();
		pessoa3.toString();
		//scanner para selecionar
		if(true){
			//seletor pegaria apenas 1
			infopessoa1.toString();
			infopessoa3.toString();
		}
		
	}

}
