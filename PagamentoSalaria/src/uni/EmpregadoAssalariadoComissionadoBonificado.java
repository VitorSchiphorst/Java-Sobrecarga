package uni;

public class EmpregadoAssalariadoComissionadoBonificado extends Empregado {
	private Double salario;
	private Double comissao;
	private Double bonus;

	public EmpregadoAssalariadoComissionadoBonificado(Double salario, Double comissao, Double bonus) {
		this.salario = salario * 1200 + 300;
		this.comissao = comissao;
		this.bonus = bonus * 500;
	}
	
	@Override
	public double calcularSalario() {
		return this.salario + this.comissao + this.bonus;
	}

}
