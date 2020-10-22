/// Hacker Rank - Warmup
/// 
/// Author: Carlos L. Cuenca
/// Date:

/// ------------------------
/// Function Implementations

fun staircase(number: Int) {

    var stairString = ""

    for(index in 1..number) {

        for(jindex in 1..number - index) {

            stairString += " "

        }

        for(jindex in 1..index) {

            stairString += "#"

        }


        if(index < number) {
            
            stairString += "\n"
        
        }

    }

    println(stairString)

}


/// -------------
/// Drive Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val number : Int = readLine()!!.toInt()

		staircase(number)

		inputCount--

	}

}