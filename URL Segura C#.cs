using System;

class Program {
    static void Main(string[] args) {
        // Lê a entrada do usuário
        string url = Console.ReadLine(); 

        string resultado;

        if (url.StartsWith("https://")) {
            resultado = "URL segura";
        } else if (url.StartsWith("http://")) {
            resultado = "URL nao segura";
        } else {
            resultado = "Formato invalido";
        }

        // Exibe o resultado
        Console.WriteLine(resultado);
    }
}
