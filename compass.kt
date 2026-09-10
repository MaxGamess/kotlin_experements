fun main(args: Array<String>) {
    val n1 = args[0].toInt()
    val n2 = args[1].toInt()
    var compass = 0
    if (n1 == -1){compass -= 1}
    else if (n1 == 1){compass += 1}
    else{compass += 2}
    
    if (n2 == -1){compass -= 1}
    else if (n2 == 1){compass += 1}
    else{compass += 2}
    
    when (compass){
        0-> print("Nort")
        1-> print("West")
        2-> print("South")
        -1-> print("East")
        3-> print("East")
    }
}
