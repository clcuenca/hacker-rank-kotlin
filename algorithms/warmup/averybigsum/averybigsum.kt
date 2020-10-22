/// Hacker Rank - Warmup
/// A Very Big Sum
/// Author: Carlos L. Cuenca
/// Date: 10/22/2020

/// ------------------------
/// Function Implementations

fun aVeryBigSum(array: Array<Long>): Long {

	var sum: Long = 0

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

		val numbers : Array<Long> = readLine()!!.split(' ').map(String::toLong).toTypedArray()

		println(aVeryBigSum(numbers))

		inputCount--

	}

}