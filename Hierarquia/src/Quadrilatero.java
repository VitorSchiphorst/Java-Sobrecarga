public class Quadrilatero extends Figura2D {
    private Double base;
    private Double altura;

    public Quadrilatero(Double base, Double altura) {
		this.base = base;
        this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return this.altura * this.base;
	}
}