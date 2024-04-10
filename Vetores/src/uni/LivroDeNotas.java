package uni;

import java.util.Random;

import javax.swing.JOptionPane;

public class LivroDeNotas {
	private String nomeDisciplina;
	private Double[] notas1;
	private Double[] notas2;
	private Double[] media;
	private Integer qtdAlunos;
	private Double notaMaior;
	private Double notaMaiorOculta;
	private Double div;
	
	public LivroDeNotas(String nomeDisciplina, Integer qtdAlunos) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas1 = new Double[qtdAlunos];
		this.notas2 = new Double[qtdAlunos];
		this.media = new Double[qtdAlunos];
		this.qtdAlunos = qtdAlunos;
	}
	
	public void gerarNotas() {
		Random r = new Random();
		
		for (int i = 0; i < this.qtdAlunos; i++) {
			this.notas1[i] = r.nextDouble() * 10;
			this.notas2[i] = r.nextDouble() * 10;
		}
	}
	
	public void calcMedia() {
		for (int i = 0; i < this.qtdAlunos; i++) {
			Double medias = (this.notas1[i] + this.notas2[i])/ 2;
			this.media[i] = medias;
		}
	}
	
	public void mostrarMedias() {
		String allMedias = "";
		
		for (int i = 0; i < media.length; i++) {
			allMedias += String.format("Aluno %d = %.2f\n", i, media[i]);
		}
		
		JOptionPane.showMessageDialog(null, allMedias);
	}
	
	public void maiorNota() {
		notaMaior = 0.0;
		Double media;
		String maior = "";
		
		for (int i = 0; i < this.qtdAlunos; i++) {
			media = this.media[i];
			
			if(media >= notaMaior) {
				notaMaior = media;
				maior = String.format("Aluno %d teve a maior Nota = %.2f", i, notaMaior);
			}
		}
		
		JOptionPane.showMessageDialog(null, maior);
	}

	public void maiorNotaOculto() {
		notaMaiorOculta = 0.0;
		Double media;
		
		for (int i = 0; i < this.qtdAlunos; i++) {
			media = this.media[i];
			
			if(media >= notaMaiorOculta) {
				notaMaiorOculta = media;
			}
		}
	}
	
	public void variancia() {
		Double mediaTurma = 0.0;
		Double div = 0.0;
		String result = "";
		for (int i = 0; i < this.qtdAlunos; i++) {
			if (this.media[i] >= 7.0) {
				mediaTurma += this.media[i];				
			}
		}
		
		mediaTurma = mediaTurma / this.qtdAlunos;
		
		Double soma = 0.0;
		
		for (int i = 0; i < this.qtdAlunos; i++) {
			if (this.media[i] >= 7.0) {
				soma += Math.pow(this.media[i] - mediaTurma, 2);			
			}
		}

		div = soma / (this.qtdAlunos - 1);

		result = String.format("Variância = %.2f", notaMaior);

		JOptionPane.showMessageDialog(null, result);
	}
	
	public void desvioPadrao() {
		Double result = Math.sqrt(this.div);

		String saida = String.format("Variância = %.2f", result);

		JOptionPane.showMessageDialog(null, saida);
	}

	public void mediaTotal() {
		Double soma = 0.0;
		Integer j = 0;
		Double result = 0.0;
		for (int i = 0; i < this.qtdAlunos; i++) {
			
			if (this.media[i] >= 7.0) {
				soma += this.media[i];
				j++;
			}
		}

		result = soma / j;

		String saida = String.format("Variância = %.2f", result);

		JOptionPane.showMessageDialog(null, saida);
	} 

	public void segMaiorNota() {
		Double notaAnterior = this.media[0];
		String segMaior = "";
		
		for (int i = 0; i < this.qtdAlunos; i++) {
			if (this.notaMaiorOculta > notaAnterior && notaAnterior < this.media[i] && this.notaMaiorOculta != this.media[i]) {
				notaAnterior = this.media[i];
				
				segMaior = String.format("O Aluno %d teve a Segunda Maior Nota = %.2f", i, notaAnterior);
			}
		}

		JOptionPane.showMessageDialog(null, segMaior);
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public Double[] getNotas1() {
		return notas1;
	}

	public Double[] getNotas2() {
		return notas2;
	}

	public Double[] getMedia() {
		return media;
	}

	public Integer getQtdAlunos() {
		return qtdAlunos;
	}

	public Double getNotaMaior() {
		return notaMaior;
	}
}
