package projetoIntegrador;

public class Ativos{
	protected String cpf;
	protected String nome;
	protected String vinculo;
	protected double totalLiquido;
	protected String export;
	
	public Ativos(String cpf, String nome, String vinculo, double totalLiquido) {
		this.cpf = cpf;
		this.nome = nome;
		this.vinculo = vinculo;
		this.totalLiquido = totalLiquido;
	}
	
	public void exportar(int export){
		if (export == 1){
			this.export = ".pdf"; 
		}
		
		if (export == 2	){
			this.export = ".xis"; 
		}
		
		if (export == 3	){
			this.export = ".csv"; 
		}
		
		if (export == 4	){
			this.export = ".txt"; 
		}
		
		if (export == 5	){
			this.export = ".json"; 
		}
	}
	
	
	@Override
	public String toString() {
		return "Ativos [cpf=" + cpf + ", nome=" + nome + ", vinculo=" + vinculo + ", totalLiquido=" + totalLiquido
				+ "]";
	}
	
	
	
	//getters and setters
	
}
