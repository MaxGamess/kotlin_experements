import kotlin.math.pow

fun main(args: Array<String>) {
    if (args[1] == "+"){
        print("${args[0]} + ${args[2]} = ${args[0].toFloat() + args[2].toFloat()}")
    }
    else if (args[1] == "-"){
        print("${args[0]} - ${args[2]} = ${args[0].toFloat() - args[2].toFloat()}")
    }
    else if (args[1] == "*"){
        print("${args[0]} * ${args[2]} = ${args[0].toFloat() * args[2].toFloat()}")
    }
    else if (args[1] == "/"){
        print("${args[0]} / ${args[2]} = ${args[0].toFloat() / args[2].toFloat()}")
    }
    else if (args[1] == "^"){
        print("${args[0]} в степени ${args[2]} = ${args[0].toFloat().pow(args[2].toFloat())}")
    }
    else {
        print("не предвиденный оператор")
    }
}
