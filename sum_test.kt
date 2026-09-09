fun main(args:Array<String>){
	val input = args
	var sum = 0
	for (i in input){
        sum += i.toIntOrNull() ?: 0
	}
	println("Сумма введенных чисел: $sum")
}
