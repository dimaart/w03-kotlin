class classPerson(val number: Int, val name:String) { // Primary constructor
    // class body
    //
    // Initialization block
    var age: Int = number
    var firstName: String = name

    init {
        println("Name = $firstName")
        println("Age = $age")
    }

}
fun main(){
    val person1 = classPerson(15, "Val")
    val person2 = classPerson(25, "John")
    println("Number: ${person1.age}")
    println("Number: ${person2.firstName}")
}