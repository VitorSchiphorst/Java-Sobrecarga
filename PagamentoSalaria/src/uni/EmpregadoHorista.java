package uni;

import javax.swing.JOptionPane;

public class EmpregadoHorista extends Empregado {
	private Double valorHora;
	private Integer numHoras;
	
	public EmpregadoHorista(Double valorHora, Integer numeroHoras) {
		this.valorHora = valorHora + 60;
		this.numHoras = numeroHoras * 20 + 30;
	}
	
	@Override
	public double calcularSalario() {
		return this.valorHora * this.numHoras;
	}
}

