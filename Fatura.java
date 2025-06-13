import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> itens;
    private double valorTotal;

    public Fatura() {
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        valorTotal += item.getValorTotal();
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== FATURA ===\n");
        
        for (Item item : itens) {
            sb.append(item.toString()).append("\n");
        }
        
        sb.append("\nValor Total da Fatura: R$ ").append(String.format("%.2f", valorTotal));
        return sb.toString();
    }
} 