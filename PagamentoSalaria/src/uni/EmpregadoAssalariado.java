package uni;

public class EmpregadoAssalariado extends Empregado {
	private Double salario;

	public EmpregadoAssalariado(Double salario) {
		this.salario = salario * 1500 + 500;
	}
	
	@Override
	public double calcularSalario() {
		return this.salario;
	}
}
