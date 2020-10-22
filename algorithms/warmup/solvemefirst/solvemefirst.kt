/// Hacker Rank - Warmup
/// Solve Me First
/// Author: Carlos L. Cuenca
/// Date: 10/22/2020

/// -------
/// Imports

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/// ------------------------
/// Function Implementations

fun solveMeFirst(a: Int, b: Int): Int {

	return a + b

}

/// -------------
/// Drive Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val numbers : List<Int> = readLine()!!.split(' ').map(String::toInt)

		println(solveMeFirst(numbers[0], numbers[1]))

		inputCount--

	}

}