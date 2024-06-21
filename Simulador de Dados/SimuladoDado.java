import java.util.Random;

public class SimuladorDeDado {
 private int[] resultados;
 private Random random;
    public SimuladorDeDado() {
        this.resultados = new int[3];
        this.random = new Random();
    }

     private int rolarDado() {
        return random.nextInt(6) + 1;
    }

    public int[] jogarTresVezes() {
        for (int i = 0; i < 3; i++) {
            resultados[i] = rolarDado();
        }
        return resultados;
    }

      public int somarResultados() {
        int soma = 0;
        for (int resultado : resultados) {
            soma += resultado;
        }
        return soma;
    }
    public void jogarESomar() {
        int[] jogadas = jogarTresVezes();
        System.out.print("REsutado das três tentativas: ");
        for (int jogada : jogadas) {
            System.out.print(jogada + " ");
        }
        System.out.println();
        System.out.println("Soma: " + somarResultados());
    }

    public static void main(String[] args) {
        SimuladorDeDado simulador = new SimuladorDeDado();
        simulador.jogarESomar();
    }
}
