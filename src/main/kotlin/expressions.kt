// Kotlin expressions
// if.. else
fun main(args: Array<String>) {

    val result = if (number > 0) { // We assign value to result
        "Positive number"
    } else {
        "Negative number"
    }

    println(result)

    // val result = if (number > 0) "Positive number" else "Negative number"

    val number = 0

    val result1 = if (number > 0)
        "positive number"
    else if (number < 0)
        "negative number"
    else
        "zero"

    println("number is $result1")
}
