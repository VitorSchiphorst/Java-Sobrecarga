public class TrianguloEscaleno extends Figura2D {
    private Double base;
    private Double altura;

    public TrianguloEscaleno(Double base, Double altura) {
	    this.base = base;
	    this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return (this.base * this.altura)/ 2;
	}
}