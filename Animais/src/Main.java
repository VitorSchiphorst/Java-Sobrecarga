public class Main {
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro("Tiquinho", 4);
        Gato g = new Gato("Soares", 4);
        Reptil r = new Reptil("Loco", 4, 7);
        Aves a = new Aves("Abreu", 2, 14);
        Ornitorrinco o = new Ornitorrinco("Francisco das Chagas Soares", 4, 7);

        System.out.println("--- Cachorro ---\n");
        System.out.printf("Nome = %s\nQuantidade de Patas = %d\n\n", c.getNome(), c.getQtdPatas());
        
        System.out.println("--- Gato ---\n");
        System.out.printf("Nome = %s\nQuantidade de Patas = %d\n\n", g.getNome(), g.getQtdPatas());

        System.out.println("--- Reptil ---\n");
        System.out.printf("Nome = %s\nQuantidade de Patas = %d\n Reproduziu = %d\n\n", r.getNome(), r.getQtdPatas(), r.getQtdReproducao());

        System.out.println("--- Aves ---\n");
        System.out.printf("Nome = %s\nQuantidade de Patas = %d\n Reproduziu = %d\n\n", a.getNome(), a.getQtdPatas(), a.getQtdReproducao());

        System.out.println("--- Ornitorrinco ---\n");
        System.out.printf("Nome = %s\nQuantidade de Patas = %d\n Reproduziu = %d\n\n", o.getNome(), o.getQtdPatas(), o.getQtdReproducao());
    }
}
