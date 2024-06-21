import java.util.Scanner;

public class Farmacia {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double preco;
    System.out.println("Digite o preço:");
        
    while (true) {
   preco = scanner.nextDouble();
            
            
     if (preco == 0) {
      break;
     }
         double novoPreco = preco * 1.12;
            
         long precoArredondado = Math.round(novoPreco);
          System.out.println("Preço ajustado: " + precoArredondado);
          System.out.println("Digite o novo preço :");
        }
        scanner.close();
        System.out.println(" Encerrado ");
    }
}
