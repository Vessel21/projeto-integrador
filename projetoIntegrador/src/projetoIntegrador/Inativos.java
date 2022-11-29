package projetoIntegrador;

public class Inativos extends Ativos{
	
	public Inativos(String cpf, String nome, String vinculo, double totalLiquido) {
		super(cpf, nome, vinculo, totalLiquido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Inativos [cpf=" + cpf + ", nome=" + nome + ", órgão=" + vinculo + ", totalLiquido=" + totalLiquido
				+ "]";
	}	
	
}
