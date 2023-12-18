// Leitura da entrada do usuário:
const url = gets();
var resultado;

if (url.startsWith("https://")) {
  resultado = "URL segura";
} else if (url.startsWith("http://")) {
  resultado = "URL nao segura";
} else {
  resultado = "Formato invalido";
}

// Exibe o resultado
print(resultado);
