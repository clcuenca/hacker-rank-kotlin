/// Hacker Rank - Warmup
/// Birthday Cake Candles
/// Author: Carlos L. Cuenca
/// Date: 10/26/2020

/// ------------------------
/// Function Implementations

fun birthdayCakeCandles(candles: Array<Int>): Int {

	var maximum = 0
	var maximumCount = 0

	for(candle in candles) {

		if(candle > maximum) {

			maximum = candle
			maximumCount = 1

		} else if (candle == maximum) {

			maximumCount++

		}

	}

	return maximumCount

}

/// -------------
/// Drive Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val candles : Array<Int> = readLine()!!.split(' ').map(String::toInt).toTypedArray()

		println(birthdayCakeCandles(candles))

		inputCount--

	}

}