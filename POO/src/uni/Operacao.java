package uni;

public class Operacao {
	private Integer numFatorial = 0;
	private Integer numSubtraendo = 0;
	private Integer numGen1 = 0;
	private Integer numGen2 = 0;
	private Integer numMinuendo = 0;
	
	public Operacao() {
		this.numFatorial = 0;
		this.numGen1 = 0;
		this.numGen2 = 0;
		this.numMinuendo = 0;
		this.numSubtraendo = 0;
	}
	
	public Integer getNumMinuendo() {
		return numMinuendo;
	}
	public void setNumMinuendo(Integer numMinuendo) {
		this.numMinuendo = numMinuendo;
	}
	public Integer getNumFatorial() {
		return fatorialRecursivo(numFatorial);
	}
	public void setNumFatorial(Integer numFatorial) {
		this.numFatorial = numFatorial;
	}
	public Integer getNumSubtraendo() {
		return numSubtraendo;
	}
	public void setNumSubtraendo(Integer numSubtracao) {
		this.numSubtraendo = numSubtracao;
	}
	public Integer getNumGen1() {
		return numGen1;
	}
	public void setNumGen1(Integer numGen1) {
		this.numGen1 = numGen1;
	}
	public Integer getNumGen2() {
		return numGen2;
	}
	public void setNumGen2(Integer numGen2) {
		this.numGen2 = numGen2;
	}
	
	public Integer somaDois(Integer num1, Integer num2) {
		return num1 + num2;
	}
	
	public Integer fatorialRecursivo(Integer num) {
		if ((num == 1) || (num == 0)) {
			return 1;
		} else {
			return fatorialRecursivo(num - 1)* num;
		}
		
	}
	
	public Integer multiplicacao() {
		return this.numGen1 * this.numGen2;
	}
	
	public Integer subtracao() {
		return numMinuendo - numSubtraendo;
	}
	
	public Integer divisao() {
		return this.numGen1 * this.numGen2;
	}
	
	public Integer somaTres(Integer num1, Integer num2, Integer num3) {
		return num1 + num2 + num3;
	}
	
	public Integer somaText(String num1, String num2) {
		return Integer.parseInt(num1) + Integer.parseInt(num2);
	}
	
	public Integer exponenciacao(Integer num1, Integer num2) {
		Integer numExponenciado = 1;
		for (int i = 1; i <= num2; i++) {
			numExponenciado *= num1;
		}		
		return numExponenciado;
	}
}
