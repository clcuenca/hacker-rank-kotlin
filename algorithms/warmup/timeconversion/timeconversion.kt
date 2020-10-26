/// Hacker Rank - Warmup
/// Time Conversion
/// Author: Carlos L. Cuenca
/// Date: 10/26/2020

/// ------------------------
/// Function Implementations

fun timeConversion(time: String): String {

    var hours      = (time[0].toString() + time[1].toString()).toInt()
    var minutes    = (time[3].toString() + time[4].toString()).toInt()
    var seconds    = (time[6].toString() + time[7].toString()).toInt()
    var timePeriod = (time[8].toString() + time[9].toString())

    var newTime = ""

    hours = hours % 12

    if(timePeriod == "PM") {

        hours += 12

    }

    if(hours < 10) {

        newTime += ("0" + hours.toString())

    } else {

        newTime += hours.toString()

    }

    newTime += ":"

    if(minutes < 10) {

        newTime += ("0" + minutes.toString())

    } else {

        newTime += minutes.toString()

    }

    newTime += ":"

    if(seconds < 10) {

        newTime += ("0" + seconds.toString())

    } else {

        newTime += seconds.toString()

    }

    return newTime

}

/// -------------
/// Drive Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val numbers : List<Int> = readLine()!!.split(' ').map(String::toInt)

		println()

		inputCount--

	}

}