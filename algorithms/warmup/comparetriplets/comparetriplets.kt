/// Hacker Rank - Warmup
/// 
/// Author: Carlos L. Cuenca
/// Date:

/// ------------------------
/// Function Implementations

fun compareTriplets(alice: Array<Int>, bob: Array<Int>): Array<Int> {

	 var aliceCount = 0
	 var bobCount   = 0

	 for(index in 0 until 3) {

	 	 if(alice[index] > bob[index]) aliceCount++
	 	 if(alice[index] < bob[index]) bobCount++

	 }

	 return arrayOf(aliceCount, bobCount)

}

/// -------------
/// Drive Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val alice : Array<Int> = readLine()!!.split(' ').map(String::toInt).toTypedArray()
		val bob   : Array<Int> = readLine()!!.split(' ').map(String::toInt).toTypedArray()

		println(compareTriplets(alice, bob).joinToString(" "))

		inputCount--

	}

}