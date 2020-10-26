/// Hacker Rank - Algorithms - Dynamic Programming
/// Coin Change
/// Author: Carlos L. Cuenca
/// Date: 10/25/2020

/// ------------------------
/// Function Implementations

fun getWays(n: Int, coins: MutableList<Int>): Int {

	coins.add(0)
	coins.sort()

	var matrix : MutableList<MutableList<Int>> = mutableListOf<MutableList<Int>>()

	for(index in 0 until coins.size) {

		matrix.add(MutableList(n + 1) { 0 })

	}

	for(row in 0 until matrix.size)
		for(column in 0 until matrix[row].size) {

			if(column == 0) matrix[row][column] = 1

			else if (row - 1 >= 0) {

				matrix[row][column] = matrix[row - 1][column]

				if(column - coins[row] >= 0) {

					matrix[row][column] += matrix[row][column - coins[row]]

				}

			}

		}

	return matrix[coins.size - 1][n]

}

/// -------------
/// Drive Program

fun main(args: Array<String>) {

	var linesRead  : Int = 0
	var number     : Int = 0
	var inputCount : Int = readLine()!!.toInt()

	while (inputCount != 0) {

		if(linesRead == 0) {

			val numbers : Array<Int> = readLine()!!.split(' ').map(String::toInt).toTypedArray()

			number = numbers[0]

			linesRead += 1

		} else if(linesRead == 1) {

			val coins : MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()

			println(getWays(number, coins))

			linesRead = 0;
			inputCount--

		}

	}

}