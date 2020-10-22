/// Hacker Rank - Warmup
/// Simple Array Sum
/// Author: Carlos L. Cuenca
/// Date: 10/22/2020

/// ------------------------
/// Function Implementations

fun simpleArraySum(array: Array<Int>): Int {

	var sum = 0

	for(number in array) {

		sum += number

	}

	return sum

}

/// -------------
/// Drive Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val numbers : List<Int> = readLine()!!.split(' ').map(String::toInt)

		println(simpleArraySum(numbers.toTypedArray()))

		inputCount--

	}

}