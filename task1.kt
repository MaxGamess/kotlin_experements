val a = 5
val b = 3
val r = 4.0
val pi = 3.14
val rub = 123
val dol = 0

fun main(){
    perimetr()
    length()
    dollar()
}

fun perimetr(){
    println("Периметр со сторонами $a и $b = ${a+b*2}")
}

fun length(){
    println("Длина окружности с радиусом $r = ${2*pi*r}")
}

fun dollar(){
    println("$rub рублей = ${rub * 85} долларов")
}
