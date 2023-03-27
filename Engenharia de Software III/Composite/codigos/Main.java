public class Main {
    public static void main(String[] args) {
        // Criação de alguns arquivos "folha"
        Arquivo arquivo1 = new ArquivoLeaf("arquivo1.txt");
        Arquivo arquivo2 = new ArquivoLeaf("arquivo2.txt");
        Arquivo arquivo3 = new ArquivoLeaf("arquivo3.txt");

        // Criação de uma pasta "composite"
        PastaComposite pasta1 = new PastaComposite("Pasta1");

        // Adiciona os arquivos na pasta
        pasta1.adicionar(arquivo1);
        pasta1.adicionar(arquivo2);

        // Criação de uma outra pasta "composite"
        PastaComposite pasta2 = new PastaComposite("Pasta2");

        // Adiciona a pasta1 e o arquivo3 na pasta2
        pasta2.adicionar(pasta1);
        pasta2.adicionar(arquivo3);

        // Imprime o nome da pasta2 e todos os seus arquivos e subpastas
        
        System.out.println("--");
        pasta2.printNome();
        System.out.println("--");

        System.out.println("--");
        pasta1.printNome();
        System.out.println("--");

        //removendo o arquivo 3 da pasta 2
        pasta2.remover(arquivo3);
        System.out.println("--");
        pasta2.printNome();
        System.out.println("--");

        // Neste exemplo, a interface Arquivo representa o Componente do padrão Composite e a classe 
        // ArquivoLeaf representa a Folha. A classe PastaComposite representa o Composite e pode armazenar 
        // tanto objetos do tipo ArquivoLeaf quanto objetos do tipo PastaComposite. 
        
        //Na classe Main, é criada uma hierarquia de pastas e arquivos e é utilizado o método printNome() 
        // para imprimir todos os nomes dos arquivos e pastas da hierarquia.
    }
}
