package Conteudo.Funcoes

import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main() {

    wellcome()
    val resultado = somar() + 2
    println(resultado)

    val horario = Horario() // Cria uma instância da classe Saudacao
    horario.saudacao() // Chama o método saudacao
}

//Desclarei a função welcome
fun wellcome() {
    "Olá"
}

fun somar(): Int { //retorna um inteiro
    return 2 + 3
}
