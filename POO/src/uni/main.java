package uni;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		Operacao op = new Operacao();
		Integer tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite a Operação\n"
																	+ "1 - Adição dois valores Inteiros\n"
																	+ "2 - Subtração\n"
																	+ "3 - Multiplicação\n"
																	+ "4 - Divisão\n"
																	+ "5 - Exponenciação\n"
																	+ "6 - Fatorial\n"
																	+ "7 - Adição de Três Valores\n"
																	+ "8 - Adição de Dois Valores Texto"));
		Integer valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Primeiro Valor: "));
		Integer valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Segundo Valor: "));
		Integer valor3 = 0;
		
		if (tipo == 7) {
			valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Terceiro Valor: "));
		}
			
		
		switch(tipo) {
			case 1: 
				JOptionPane.showMessageDialog(null, "Soma dos Dois Valores = " + op.somaDois(valor1, valor2));
				break;
			case 2:
				op.setNumMinuendo(valor1);
				op.setNumSubtraendo(valor2);
				JOptionPane.showMessageDialog(null, "Subtração = " + op.subtracao());
				break;
			case 3:
				op.setNumGen1(valor1);
				op.setNumGen2(valor2);
				JOptionPane.showMessageDialog(null, "Multiplicação = " + op.multiplicacao());
				break;
			case 4:
				op.setNumGen1(valor1);
				op.setNumGen2(valor2);
				JOptionPane.showMessageDialog(null, "Multiplicação = " + op.divisao());
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Exponenciação = " + op.exponenciacao(valor1, valor2));
				break;
			case 6:
				op.setNumFatorial(valor1);
				JOptionPane.showMessageDialog(null, "Fatorial = " + op.getNumFatorial());
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Adição 3 Valores = " + op.somaTres(valor1, valor2, valor3));
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Adição 2 Valores Texto = " + op.somaText(Integer.toString(valor1), Integer.toString(valor2)));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operação Inválida");
				break;
		}

	}

}
