package conteudo.oop.construtor

import javax.swing.text.StyledEditorKit.BoldAction

fun main() {
    val user1 = User(name = "Natan", isAdmin = true)
    println(user1.imprimirInformacoes())

    val user2 = User(name = "Matteo", isAdmin = false)
    println(user2.imprimirInformacoes())

    val user3 = User(name = "Natan", lastName = "Amorim", isAdmin = true)
    println(user3.imprimirInformacoes())
}

//construtor primário
class User (var name: String, var lastName: String, var isAdmin: Boolean) {

    init {  //init para inicializar, pode ser utilizado entre os construtores ou se tiver só o padrão antes dele
        println("Olá!")
    }
    //construtor secundário
    constructor(name: String, isAdmin: Boolean) : this(name, "", isAdmin)
    fun imprimirInformacoes(){
        println("Nome: $name, Sobrenome: $lastName, isAdmin: $isAdmin")
    }
}