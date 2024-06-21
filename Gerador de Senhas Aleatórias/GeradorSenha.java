import java.util.Random;
public class GeradorDeSenha {
 public static String gerarSenha() {
  Random random = new Random();
     int numeroDeDigitos = random.nextInt(6) + 5; 
        
    StringBuilder senha = new StringBuilder();
        for (int i = 0; i < numeroDeDigitos; i++) {
            int digito = random.nextInt(10); 
            senha.append(digito);
        }
        
        return senha.toString();
    }
    
   public static void main(String[] args) {
        String senhaAleatoria = gerarSenha();
        System.out.println("Senha aleatória gerada: " + senhaAleatoria);
    }
}
