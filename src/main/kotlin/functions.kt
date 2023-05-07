// Kotlin has standard functions like println(), and user defined
// Here is user defined
fun myFunction(){
    // Code
}
// If you want to call that function you will need to call myFunction() in main() function

// Arguments, return type String
fun myFunction(number:Int, text:String): String {
    println("Number: $number, text: $text")
    return text
}
// Conditional functions



fun main() {
    myFunction(15, "My text is here")
}
