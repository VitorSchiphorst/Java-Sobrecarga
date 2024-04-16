package uni;

public class Gerente extends Empregado {
    private Double salario;
    private Double bonus;
    private Boolean prob;
    private Double loteria;

    public Gerente(double salario, double bonus, boolean prob, double loteria) {
		this.salario = salario;
		this.bonus = bonus;
        this.prob = prob;
        this.loteria = loteria;       
	}
	
	@Override
	public double calcularSalario() {
        Double result = 0.0;
        if (prob = true) {
            result = this.salario + this.bonus + this.loteria;
        } else {
            result = this.salario + this.bonus;
        }
		return result;
	}
}
