package Conteudo

import java.time.LocalDate

fun main(){

//Formatação de Texto
    val welcome = """
        Olá, Elinatan, 
        seu produto chegou!
    """.trimIndent() //isso retira os espaços extras nas extremidades
    println(welcome)

    val csv ="""
    texto1,
    texto2,
    texto3
    """.replaceIndent(";")
    println(csv)

    var name = "Elinatan"
    var age = 34
    var height = 1.72
    println("Olá $name. Você tem $age anos e sua altura é $height")


    /*Teste - Crie um programa que possa imprimir a quantidade de caracteres do seu nome e também qual será a sua idade no ano 2050.
Exemplo de mensagem: Olá Tiago. Em 2050 você terá 60 anos. Seu nome possui 5 caracteres.
     */
    var dataFinal = 2050
    val dataInicial = 1990
    val anoAtual = LocalDate.now().year
    val ageCalculada = anoAtual - dataInicial
    val idadeFutura = (dataFinal - anoAtual) + age
    val tamanhoNome = name.length
    println("Olá $name. Atualmente dua idade é $ageCalculada, já em 2050 você téra $idadeFutura anos. " +
            "Seu nome possui $tamanhoNome caracteres")

    val produto1 = "notebook"
    val produto2 = "notebook"
    println(produto1 == produto2)



}
