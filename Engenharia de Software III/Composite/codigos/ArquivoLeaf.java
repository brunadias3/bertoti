// Classe Leaf (Folha)
public class ArquivoLeaf implements Arquivo {
    private String nome;

    public ArquivoLeaf(String nome) {
        this.nome = nome;
    }

    @Override
    public void printNome() {
        System.out.println(nome);
    }
}