import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fatura fatura = new Fatura();
        
        Produto produto1 = new Produto("Notebook", 1, 3500.00);
        Produto produto2 = new Produto("Mouse", 2, 50.00);
        Produto produto3 = new Produto("Teclado", 3, 150.00);
        
        Produto[] produtos = {produto1, produto2, produto3};
        
        boolean executar = true;
        
        while (executar) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Comprar");
            System.out.println("2 - Ver Fatura");
            System.out.println("3 - Encerrar Programa");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("\nProdutos disponíveis:");
                    for (Produto p : produtos) {
                        System.out.println(p.toString() + "\n");
                    }
                    
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    
                    Produto produtoSelecionado = null;
                    for (Produto p : produtos) {
                        if (p.getCodigo() == codigo) {
                            produtoSelecionado = p;
                            break;
                        }
                    }
                    
                    if (produtoSelecionado != null) {
                        Item item = new Item(produtoSelecionado, quantidade);
                        fatura.adicionarItem(item);
                        System.out.println("\nItem adicionado com sucesso!");
                    } else {
                        System.out.println("\nProduto não encontrado!");
                    }
                    break;
                    
                case 2:
                    System.out.println("\n" + fatura.toString());
                    break;
                    
                case 3:
                    executar = false;
                    System.out.println("\nPrograma encerrado!");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida!");
            }
        }
        
        scanner.close();
    }
} 