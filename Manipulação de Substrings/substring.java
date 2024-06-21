public class SubstringExample {
 public static String getSubstringWithoutLastChar(String str) {
    if (str == null || str.isEmpty()) {
    return str; 
        }
     return str.substring(0, str.length() - 1);
    }

    // testando ///
    public static void main(String[] args) {
    String originalString = "Hello, World!";
        String resultString = getSubstringWithoutLastChar(originalString);
     System.out.println("Original String: " + originalString);
    System.out.println("Substring without last char: " + resultString);
    }
}
