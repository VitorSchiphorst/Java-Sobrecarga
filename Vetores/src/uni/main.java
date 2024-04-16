package uni;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog(null, "Informe a Máteria:");
		Integer alunos = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a os alunos:"));
		Integer k = 0;

		while (k != 50) {
			
			Integer tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha para Exibir:\n"
					+ "1 - Exibir Médias\n"
					+ "2 - Exibir Desvio Padrão\n"
					+ "3 - Exibir Maior Nota\n"
					+ "4 - Exibir Segunda Nota\n"
					+ "5 - Exibir Média Total\n"
					+ "6 - Exibir Variância\n"
					+ "7 - Sair"));
			
			LivroDeNotas l = new LivroDeNotas(disciplina, alunos);

			l.gerarNotas();
			l.calcMedia();
			l.maiorNotaOculto();
			
			switch (tipo) {
				case 1:
					l.mostrarMedias();
					break;

				case 2:
					l.desvioPadrao();
					break;

				case 3:
					l.maiorNota();
					break;

				case 4:
					l.segMaiorNota();
					break;

				case 5:
					l.segMaiorNota();
					break;

				case 6:
					l.variancia();
					break;

				case 7:
					break;

			}
			k++;
			break;
		}
	}
}
