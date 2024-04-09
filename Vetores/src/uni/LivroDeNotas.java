package uni;

import java.util.Random;

import javax.swing.JOptionPane;

public class LivroDeNotas {
	private String nomeDisciplina;
	private Double[] notas1;
	private Double[] notas2;
	private Double[] media;
	private Integer qtdAlunos;
	
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
		Double notaMaior = 0.0;
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
	
	public double variancia() {
		Double mediaTurma = 0.0;
		
		for (int i = 0; i < this.qtdAlunos; i++) {
			mediaTurma += this.media[i];
		}
		
		mediaTurma = mediaTurma / this.qtdAlunos;
		
		Double soma = 0.0;
		
		for (int i = 0; i < this.qtdAlunos; i++) {
			soma += Math.pow(this.media[i] - mediaTurma, 2);			
		}
		
		return soma / (this.qtdAlunos - 1);
	}
	
	public double desvioPadrao() {
		return Math.sqrt(this.variancia());
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
}
