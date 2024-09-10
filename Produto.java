
public class Produto {

    private String nome;
    private double preço;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void AdicionarProdutoAoEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void RemoverProdutoDoEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public void AtualizarPreço(double NovoPreço){
        this.preço = NovoPreço;
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Arroz");
        produto1.setPreço(6);
        produto1.setQuantidade(20);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getPreço());
        System.out.println(produto1.getQuantidade());

        produto1.AdicionarProdutoAoEstoque(8);
        System.out.println(produto1.getQuantidade());

        produto1.RemoverProdutoDoEstoque(5);
        System.out.println(produto1.getQuantidade());

        produto1.AtualizarPreço(5);
        System.out.println(produto1.getPreço());
    }
    
}

