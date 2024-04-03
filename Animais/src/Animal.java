public class Animal {
    private String nome;
    private Integer qtdPatas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(Integer qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public Animal () {
       
    }

    public Animal (String nome) {
        this.setNome(nome);
    }

    public Animal (String nome, Integer qtdPatas) {
        this.setNome(nome);
        this.setQtdPatas(qtdPatas);
    }
}
