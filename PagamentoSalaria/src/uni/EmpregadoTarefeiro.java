package uni;

public class EmpregadoTarefeiro extends Empregado {
	private double valorTarefa;
	private int numeroTarefas;

	public EmpregadoTarefeiro(double valorTarefa, int numeroTarefas) {
		this.valorTarefa = valorTarefa;
		this.numeroTarefas = numeroTarefas;
	}
	
	@Override
	public double calcularSalario() {
		return this.valorTarefa * this.numeroTarefas;
	}	

}
