package uni;

import java.util.Random;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		Random gerador = new Random();

		Empregado[] empr = new Empregado[10];

		for (int i = 0; i < empr.length; i++) {
			Integer tipo = gerador.nextInt(5) + 1;

			switch (tipo) {
			case 1: {
				Double salario = gerador.nextDouble();
				empr[i] = new EmpregadoAssalariado(salario);
				break;
			}
			case 2: {
				Double salario = gerador.nextDouble();
				Double comissao = gerador.nextDouble();
				empr[i] = new EmpregadoAssalariadoComissionado(salario, comissao);
				break;
			}
			case 3: {
				Double salario = gerador.nextDouble();
				Double comissao = gerador.nextDouble();
				Double bonus = gerador.nextDouble();
				empr[i] = new EmpregadoAssalariadoComissionadoBonificado(salario, comissao, bonus);
				break;
			}
			case 4: {
				Integer numeroHoras = gerador.nextInt(101);
				Double valorHora = gerador.nextDouble();
				empr[i] = new EmpregadoHorista(valorHora, numeroHoras);
				break;
			}
			case 5: {
				Integer numeroTarefas = 1000 + gerador.nextInt(501);
				Double valorTarefa = gerador.nextDouble() * 60 + 20;
				empr[i] = new EmpregadoTarefeiro(valorTarefa, numeroTarefas);
				break;
			}
			case 6: {
				Integer horaDirecao = gerador.nextInt();
				Double valorHora = gerador.nextDouble() *  + 1000;
				empr[i] = new Motorista(valorHora, horaDirecao);
				break;
			}
			case 7: {
				Double salario = gerador.nextDouble(5000, 15000);
				Double bonus = gerador.nextDouble(1000, 5000);
				Boolean prob = gerador.nextBoolean();
				Double loteria = gerador.nextDouble(20000, 40000);
				empr[i] = new Gerente(salario, bonus, prob, loteria);
				break;
			}
			}
		}

		for (int i = 0; i < empr.length; i++) {
			JOptionPane.showMessageDialog(null, String.format("Empregado %d: R$%.2f\n", i + 1, empr[i].calcularSalario()));
		}
	}
}
