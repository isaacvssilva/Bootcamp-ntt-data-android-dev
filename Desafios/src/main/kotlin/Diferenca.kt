import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()
    val d = input.nextInt()

    val res = (a*b)-(c*d)
    println("DIFERENCA = $res")
}