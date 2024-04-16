package uni;

public class EmpregadoAssalariadoComissionado extends Empregado {
	private Double salario;
	private Double comissao;

	public EmpregadoAssalariadoComissionado(Double salario, Double comissao) {
		this.salario = salario * 1200 + 300;
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return this.salario + this.comissao;
	}

}
