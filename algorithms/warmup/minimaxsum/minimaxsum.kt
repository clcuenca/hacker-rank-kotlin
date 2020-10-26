
// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {

    var n = arr.size
    var choose = 4
    var minimumSum =  9999999999
    var maximumSum = -9999999999

    if(n < choose) return

    var combinations: MutableList<Int> = MutableList(choose + 2) { 0 }

    for(j in 0 until choose) {

        combinations[j] = j;

    }

    combinations[choose] = n
    combinations[choose + 1] = 0

    var j : Int = 0

    while(j < choose) {

        var sum = 0L
        // Visit the combination
        for(index in 0 until choose) {

            sum += arr[combinations[index]]

        }

        if(sum < minimumSum) minimumSum = sum
        if(sum > maximumSum) maximumSum = sum

        j = 0

        while(combinations[j] + 1 == combinations[j + 1]) {

            combinations[j] = j

            j++

        }

        combinations[j]++

    }

    print(minimumSum.toString() + " " + maximumSum.toString() + '\n')

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

    var inputCount = readLine()!!.toInt()

    while(inputCount > 0) {

        val numbers = readLine()!!.split(' ').map(String::toInt).toTypedArray()

        miniMaxSum(numbers)

        inputCount--

    }

}