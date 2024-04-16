package uni;

public class Motorista extends Empregado {
    private Integer horasDirecao;
    private Double valorHora;

    public Motorista(double valorHora, int horasDirecao) {
		this.valorHora = valorHora;
		this.horasDirecao = horasDirecao;
	}
	
	@Override
	public double calcularSalario() {
		return this.valorHora * this.horasDirecao + 1000;
	}
}
