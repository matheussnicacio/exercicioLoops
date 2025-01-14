fun main() {

//    Escreva um programa que:
//
//    Solicite ao usuário que informe um número inteiro positivo.
//    Exiba todos os números ímpares entre 1 e o número informado.
//    Caso o número seja menor que 1, exiba uma mensagem de erro e peça outro número.


    var i = 1

    println("Digite um numero inteiro positivo")
    var num: Int = readln().toInt()

    while (num < 1) {
        println("Erro. Digite o numero novamente")
        num = readln().toInt()
    }

    println("Numeros impares entre 1 e $num :")

    for (i in 1..num) {
        // Verifica se o número atual (i) é ímpar
        if (i % 2 != 0) {
            println(i)  // Exibe o número ímpar
        }
    }
}
