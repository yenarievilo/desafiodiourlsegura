url = input()

if "https://" in url:
    resultado = "URL segura"
# Condição para verificar se a URL começa com "http://"
elif "http://" in url:
    resultado = "URL nao segura"
# Se a URL não começa nem com "https://" nem com "http://", considera como "Formato invalido"
else:
    resultado = "Formato invalido"

# Exibe o resultado
print(resultado)
