public class Oviparo extends Animal {
    private Integer qtdReproducao;

    public Integer getQtdReproducao() {
        return qtdReproducao;
    }

    public void setQtdReproducao(Integer qtdReproducao) {
        this.qtdReproducao = qtdReproducao;
    }

    public Oviparo() {

    }

    public Oviparo(String nome, Integer qtdPatas) {
        super(nome, qtdPatas);
    }

    public Oviparo(String nome, Integer qtdPatas, Integer qtdReproducao) {
        super(nome, qtdPatas);
        this.setQtdReproducao(qtdReproducao);
    }
}
