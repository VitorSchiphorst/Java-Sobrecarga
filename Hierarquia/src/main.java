import java.util.Random;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		Random gerador = new Random();

		Figura2D[] fig = new Figura2D[10];
        String[] forma = new String[10];

		for (int i = 0; i < fig.length; i++) {
			Integer tipo = gerador.nextInt(5) + 1;
            
			switch (tipo) {
			case 1: {
				Double raio = gerador.nextDouble();
				fig[i] = new Circulo(raio);
                forma[i] = "Circulo";
				break;
			}
			case 2: {
				Double lado = gerador.nextDouble();
				fig[i] = new Quadrado(lado);
                forma[i] = "Quadrado";
				break;
			}
			case 3: {
				Double base = gerador.nextDouble();
				Double altura = gerador.nextDouble();
				fig[i] = new Quadrilatero(base, altura);
                forma[i] = "Quadrilatero";
				break;
			}
			case 4: {
				Double base = gerador.nextDouble();
				Double altura = gerador.nextDouble();
				fig[i] = new Retangulo(base, altura);
                forma[i] = "Circulo";
                break;
			}
			case 5: {
				Double base = gerador.nextDouble();
				Double altura = gerador.nextDouble();
				fig[i] = new Triangulo(base, altura);
                forma[i] = "Triangulo";
                break;
			}
			case 6: {
				Double lado = gerador.nextDouble();
				fig[i] = new TrianguloEquilatero(lado);
                forma[i] = "TrianguloEquilatero";
                break;
			}
			case 7: {
                Double base = gerador.nextDouble();
				Double altura = gerador.nextDouble();
				fig[i] = new TrianguloEscaleno(base, altura);
                forma[i] = "TrianguloEscaleno";
                break;
			}
            case 8: {
                Double cateto1 = gerador.nextDouble();
				Double cateto2 = gerador.nextDouble();
				fig[i] = new TrianguloRetangulo(cateto1, cateto2);
                forma[i] = "TrianguloRetangulo";
                break;
			}
			}
		}

		for (int i = 0; i < fig.length; i++) {
			JOptionPane.showMessageDialog(null, String.format("Área do %s %d = %.2fm²", forma[i],i + 1, fig[i].calcularArea()));
		}
	}
}
