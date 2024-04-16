public class TrianguloRetangulo extends Figura2D {
    private Double cateto1;
    private Double cateto2;

    public TrianguloRetangulo(Double cateto1, Double cateto2) {
	    this.cateto1 = cateto1;
	    this.cateto2 = cateto2;
	}
	
	@Override
	public double calcularArea() {
		return (this.cateto1 * this.cateto2)/ 2;
	}
}