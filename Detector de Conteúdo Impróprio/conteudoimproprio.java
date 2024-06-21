public class DetectorConteudoImproprio {
public String verificarConteudo(String frase) {
String fraseMinuscula = frase.toLowerCase();
   if (fraseMinuscula.contains("sexo") || fraseMinuscula.contains("sexual")) {
     return "conteúdo impróprio";
    } else {
     return "conteúdo liberado";
    }
    }

    /// exemplo ////
    public static void main(String[] args) {
        DetectorConteudoImproprio detector = new DetectorConteudoImproprio();
       String[] frases = {
            "Testando esse código.",
            "tem sexo durante o código",
            "teste sexuais",
            "asdffsgscssaaaa"
        };
    for (String frase : frases) {
        String resultado = detector.verificarConteudo(frase);
        System.out.println("Frase: \"" + frase + "\" - Resultado: " + resultado);
        }
    }
}
