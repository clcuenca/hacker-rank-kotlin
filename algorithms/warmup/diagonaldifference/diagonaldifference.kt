/// Hacker Rank - Warmup
/// Diagonal Difference
/// Author: Carlos L. Cuenca
/// Date: 10/22/2020

/// ------
/// Import

import kotlin.math.abs

/// ------------------------
/// Function Implementations

fun diagonalDifference(array: Array<Array<Int>>): Int {

	var leftDiagonal  = 0
	var rightDiagonal = 0

	// Get the Left Diagonal
	for(index in 0 until array.size){

		leftDiagonal += array[index][index]

	}

	for(index in 0 until array.size) {

		rightDiagonal += array[index][array.size - index - 1]

	}


	return abs(leftDiagonal - rightDiagonal)

}

/// -------------
/// Drive Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val matrixSize : Int = readLine()!!.toInt()

		var matrix : MutableList<Array<Int>> = mutableListOf()

		for(line in 0 until matrixSize) {

			val row : Array<Int> = readLine()!!.split(' ').map(String::toInt).toTypedArray()

			matrix.add(row)

		}

		println(diagonalDifference(matrix.toTypedArray()))

		inputCount--

	}

}