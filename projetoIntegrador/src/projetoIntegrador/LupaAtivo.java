package projetoIntegrador;

public class LupaAtivo {
	protected Ativos pessoa;
	protected String data;
	protected float remuneracao;
	protected float comissao;
	protected float beneficios;
	protected float eventuais;
	protected float horasExtras;
	protected float judiciais;
	protected float tetoRedutor;
	protected double irrf;
	protected double contribPrev;
	protected double totalLiquido;
	
	public LupaAtivo(String data, float remuneracao, float comissao, float beneficios, float eventuais, float horasExtras, float judiciais, float tetoRedutor, double irrf, double contribPrev, double totalLiquido) {
		this.data = data;
		this.remuneracao = remuneracao;
		this.comissao = comissao;
		this.beneficios = beneficios;
		this.eventuais = eventuais;
		this.horasExtras = horasExtras;
		this.judiciais = judiciais;
		this.tetoRedutor = tetoRedutor;
		this.irrf = irrf;
		this.contribPrev = contribPrev;
		this.totalLiquido = totalLiquido;
	}
	
	@Override
	public String toString() {
		return "LupaAtivo [pessoa=" + pessoa + ", data=" + data + ", remuneracao=" + remuneracao + ", comissao="
				+ comissao + ", beneficios=" + beneficios + ", eventuais=" + eventuais + ", horasExtras=" + horasExtras
				+ ", judicias=" + judiciais + ", tetoRedutor=" + tetoRedutor + ", irrf=" + irrf + ", contribPrev="
				+ contribPrev + ", totalLiquido=" + totalLiquido + "]";
	}
	
	
}
