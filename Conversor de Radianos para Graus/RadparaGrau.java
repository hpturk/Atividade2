public class ConversorRadianosParaGraus {
public double converterParaGraus(double radianos) {
    double graus = Math.toDegrees(radianos);
    return graus;
    }

public static void main(String[] args) {
    ConversorRadianosParaGraus conversor = new ConversorRadianosParaGraus();

    double[] valoresRadianos = { Math.PI, Math.PI / 2, Math.PI / 4, 2 * Math.PI };
     for (double radianos : valoresRadianos) {
            double graus = conversor.converterParaGraus(radianos);
            System.out.println(radianos + " radianos = " + graus + " graus");
        }
    }
}

