const val n = 16

fun main(){
	summa()
    multiple()
    number_summa()
    println("==============================================")
    multiple_table()
    println("==============================================")
    return_nums()
}
//task 1
fun summa(){
    var sum = 0
    for (i in 1..n){
        sum += i
    }
    println("1. Сумма чесел от 1 до N = $sum")
}
//task 2
fun multiple(){
    var mult:Long = 1
    for (i in 1..n){
        mult *= i
    }
    println("2. Произведение чесел от 1 до N = $mult")
}
//task 3
fun number_summa(){
    val numsum = n.toString().sumOf {it - '0'}
    println("3. Сумма цифр числа N = $numsum")
}
//task 4
fun multiple_table(){
    println("4. Таблица умножения на число N:")
    for (i in 1..n){
        println("$i * $n = ${i*n}")
    }
}
//task 5
fun return_nums(){
    println("5. Числа от N до 1: ${(1..n).reversed().joinToString(", ")}")
}
