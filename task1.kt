val a = 5
val b = 3
val r = 4.0
val pi = 3.14
val rub = 123
val dol = 0

fun main(){
    val f1 = perimetr()
    val f2 = length()
    val f3 = dollar()
    println("----------------------------------------")
    println("1:$f1 2:$f2 3:$f3")
    print("Оценка: 5")
}
//task 1
fun perimetr(): String{
    println("Периметр со сторонами $a и $b = ${a+b*2}")
    return "+"
}
//task 2
fun length(): String{
    println("Длина окружности с радиусом $r = ${2*pi*r}")
    return "+"
}
//task 3
fun dollar(): String{
    println("$rub рублей = ${rub * 85} долларов")
    return "+"
}
