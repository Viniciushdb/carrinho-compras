public class Item {
    private Produto produto;
    private int quantidade;
    private double valorTotal;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.valorTotal = produto.getPreco() * quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return produto.toString() + 
               "\nQuantidade: " + quantidade + 
               "\nValor Total: R$ " + String.format("%.2f", valorTotal) +
               "\n------------------------";
    }
} 