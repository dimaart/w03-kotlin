import java.util.Scanner

// Kotlin output.
// println() print() is output functions
fun main(args: Array<String>){
    println("Hello World")
    println("Hello World")
    print("Hello World ") // print() function doesn't add new line
    print("Hello World")
    println()

    val number = 10.5
    println(number)
    println("$number")

    // Input to read a line you can use readLine()
    print("Enter: ")
    val stringInput = readLine()
    // Print result
    println("You entered: $stringInput")

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    var integer:Int = reader.nextInt()
}

