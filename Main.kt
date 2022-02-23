fun main() {
    //Faça um programa que receba três inteiros e diga qual deles é o maior.

    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()

    print("Digite o terceiro número: ")
    val num3 = readLine()!!.toInt()

    if (num1 > num2 && num1 > num3) {

        println("O maior número é o primeiro: $num1")

    } else if (num2 > num1 && num2 > num3) {

        println("O maior número é o segundo: $num2")

    } else {

        println("O maior número é o terceiro: $num3")

    }

}