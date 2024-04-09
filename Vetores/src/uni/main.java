package uni;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		LivroDeNotas l = new LivroDeNotas("Programação", 10);
		
		l.gerarNotas();
		l.calcMedia();
		l.mostrarMedias();
		l.maiorNota();
		
		JOptionPane.showMessageDialog(null, "Variação = " + l.variancia());
		JOptionPane.showMessageDialog(null, "Desvio Padrão = " + l.desvioPadrao());
	}

}
