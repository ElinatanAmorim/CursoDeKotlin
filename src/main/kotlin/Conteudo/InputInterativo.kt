package Conteudo

fun main() {
    val nome = readln() //readln lê a entrada do usuário como uma String
    val desconto = 20.00
    println("Olá, $nome, voçê ganhou $desconto reais de desconto!")

    val name = readln().lowercase().replaceFirstChar {it.uppercase()} //lowercase transf tudo em minúsculo,
    // depois pega o primeiro caracter e a expressão lambad it.uppercase, o it é o caracter
    val descontoFormatado = "R$ %.2f".format(desconto)
    println("Olá, $name, você ganhou $descontoFormatado de desconto!")

    val preco = readln().toInt()
    //ou val precoAlterado = preco.toInt()
    val multiplicacao = preco * 10
    println(multiplicacao)
}