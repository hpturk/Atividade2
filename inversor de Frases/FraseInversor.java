import java.util.Scanner;
public class FraseInversor {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
    
     System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        scanner.close();
        
        String fraseSemEspacos = frase.replaceAll("\\s+", "");
        StringBuilder sb = new StringBuilder(fraseSemEspacos);
        String fraseInvertida = sb.reverse().toString();
        System.out.println("Frase invertida: " + fraseInvertida);
    }
}
