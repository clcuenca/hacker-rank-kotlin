/// Hacker Rank - Warmup
/// Plus Minus
/// Author: Carlos L. Cuenca
/// Date: 10/26/2020

/// ------------------------
/// Function Implementations

fun plusMinus(array: Array<Int>) {

	var positiveCount : Int = 0
	var negativeCount : Int = 0
	var zeroCount     : Int = 0

	for(number in array) {

		if(number > 0) positiveCount++
		if(number < 0) negativeCount++
		if(number == 0) zeroCount++

	}

	println("%.6f".format(positiveCount.toFloat() / array.size))
	println("%.6f".format(negativeCount.toFloat() / array.size))
	println("%.6f".format(zeroCount    .toFloat() / array.size))

}

/// -------------
/// Drive Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val numbers : Array<Int> = readLine()!!.split(' ').map(String::toInt).toTypedArray()

		plusMinus(numbers)

		inputCount--

	}

}