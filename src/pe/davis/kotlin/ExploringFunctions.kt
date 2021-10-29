package pe.davis.kotlin

//by default functions are public
fun printAString(value: String){
    println(value)
}
//single expression function
fun addTwoNumbers(one: Double, two: Double): Double = one + two
fun printBString(value: String) = println(value) //void return

fun printSomeMaths(one: Double,  two:Double){
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")
}
fun printSomeMathsDefaultParam(one: Double=6.2,  two: Double = 3.9){
    //one = 1.0//not work, parameters are inmutables
    println("DefaultParam one + two is ${one + two}")
    println("DefaultParam one - two is ${one - two}")
}

fun printSome(one: Double,  two:Double){
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")

    fun functionWithinAFunction(a: String){
        println(a)
    }
    functionWithinAFunction("Hello")
}
/*
fun methodTakesALambda(input: String, action: java.util.function.Function<String, Int>){
    println(action.apply(input))
}*/

fun methodTakesALambda(input: String, action: (String) -> Int) {
    println(action(input))
}



//main method must be public
fun main() {
    printAString("Hello world")
    println(addTwoNumbers(17.3,9.6))
    println(printSomeMaths(17.3,9.6))
    println(printSomeMaths(two =  17.3, one = 9.6))// you have to specify all parameters
    println(printSomeMathsDefaultParam(17.3))
    println(printSomeMathsDefaultParam(two = 17.3))
}