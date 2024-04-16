public class Triangulo extends Figura2D {
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
		this.base = base;
        this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return (this.altura * this.base)/ 2;
	}
}
