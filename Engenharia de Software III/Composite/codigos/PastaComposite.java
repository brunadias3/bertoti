import java.util.ArrayList;
import java.util.List;

// Classe Composite
public class PastaComposite implements Arquivo {
    private String nome;
    private List<Arquivo> arquivos = new ArrayList<>();

    public PastaComposite(String nome) {
        this.nome = nome;
    }

    @Override
    public void printNome() {
        System.out.println(nome);
        for (Arquivo arquivo : arquivos) {
            arquivo.printNome();
        }
    }

    public void adicionar(Arquivo arquivo) {
        arquivos.add(arquivo);
    }

    public void remover(Arquivo arquivo) {
        arquivos.remove(arquivo);
    }
}
