package projetoIntegrador;

public class LupaInativos extends LupaAtivo{
	public LupaInativos(String data, float remuneracao, float comissao, float beneficios, float eventuais,
			float horasExtras, float judiciais, float tetoRedutor, double irrf, double contribPrev,
			double totalLiquido) {
		super(data, remuneracao, comissao, beneficios, eventuais, horasExtras, judiciais, tetoRedutor, irrf, contribPrev,
				totalLiquido);
		// TODO Auto-generated constructor stub
	}

	private double proventos;

	@Override
	public String toString() {
		return "LupaInativos [pessoa=" + pessoa + ", data=" + data + ", proventos=" + proventos + ", remuneracao="
				+ remuneracao + ", comissao=" + comissao + ", beneficios=" + beneficios + ", eventuais=" + eventuais
				+ ", horasExtras=" + horasExtras + ", judicias=" + judiciais + ", tetoRedutor=" + tetoRedutor + ", irrf="
				+ irrf + ", contribPrev=" + contribPrev + ", totalLiquido=" + totalLiquido + "]";
	}
	
	
	
}
