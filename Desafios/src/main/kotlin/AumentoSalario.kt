import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    val salario = input.nextDouble()
    val percentual : Int
    val novoSalario: Double
    val reajuste: Double

    when (salario) {
        in 0.0 .. 400.00 -> {
            reajuste = (salario * 0.15)
            novoSalario = salario + reajuste
            percentual = 15
        }
        in 400.01 .. 800.00 -> {
            reajuste = (salario * 0.12)
            novoSalario = salario + reajuste
            percentual = 12
        }
        in 800.01 .. 1200.00 -> {
            reajuste = (salario * 0.10)
            novoSalario = salario + reajuste
            percentual = 10
        }
        in 1200.01 .. 2000.00 -> {
            reajuste = (salario * 0.07)
            novoSalario = salario + reajuste
            percentual = 7
        }
        else -> {
            reajuste = (salario * 0.04)
            percentual = 4
            novoSalario = salario + reajuste
        }
    }

    println(String.format("Novo salario: %.2f", novoSalario))
    println(String.format("Reajuste ganho: %.2f", reajuste))
    println("Em percentual: $percentual %")
}