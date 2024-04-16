public class TrianguloEquilatero extends Figura2D {
    private Double lado;

    public TrianguloEquilatero(Double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return ((this.lado * this.lado) * 1.732)/ 4;
	}
}