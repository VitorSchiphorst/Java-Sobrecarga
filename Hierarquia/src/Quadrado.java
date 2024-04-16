public class Quadrado extends Figura2D {
    private Double lado;

    public Quadrado(Double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}
}