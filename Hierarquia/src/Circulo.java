public class Circulo extends Figura2D {
    private Double raio;

    public Circulo(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return this.getPi() + (this.raio * this.raio);
	}
}
