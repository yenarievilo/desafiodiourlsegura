import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine(); // Lê a entrada do usuário

        String resultado;

        if (url.startsWith("https://")) {
            resultado = "URL segura";
        } else if (url.startsWith("http://")) {
            resultado = "URL nao segura";
        } else {
            resultado = "Formato invalido";
        }

        // Exibe o resultado
        System.out.println(resultado);
    }
}
