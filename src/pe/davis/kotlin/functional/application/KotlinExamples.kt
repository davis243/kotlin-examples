package pe.davis.kotlin.functional.application

import pe.davis.kotlin.functional.toSentenceCase

fun applySomeFunctionToAString(inputString: String, myFunction: (String) -> String) : String {
    return myFunction(inputString)

}

fun main() {
    val result = applySomeFunctionToAString("hello") { x -> x[0].toUpperCase() + x.substring(1)}
    val result2 = applySomeFunctionToAString("hello", ::toSentenceCase)
    val result3 = applySomeFunctionToAString("hello") { it.toUpperCase()}
    println(result)
    println(result2)
    println(result3)

    val colors = listOf("red","green", "blue", "black", "black")

    val uppercaseColors = colors.map{ it.toUpperCase()}
    uppercaseColors.forEach{ println(it)}

    val colorsStartingWithB = colors.filter { it.startsWith("b") }
    colorsStartingWithB.forEach{println(it)}

    colors.flatMap { if(it.startsWith("b")) listOf(it, it) else listOf(it)}.forEach{ println(it)}

    println(colors.reduce{ result, value -> "$result, $value"})

    val numbers = colors. map { it.length}
    numbers.forEach{println(it)}
    println(numbers.sum())
    println(numbers.average())
    println(numbers.count())

    println(numbers.fold(0){ result, value -> result + value})
    println(numbers.fold(0){ result, value -> if(value > result ) value else result})

    val myMap = mapOf(1 to "one", 2 to "two", 3 to "three")
    myMap.filter{(k, v ) -> v.startsWith("t")}.forEach{ (k,v) -> println("$k $v")}
    myMap.filter{x -> x.value.startsWith("t")}.forEach{ (k,v) -> println("$k $v")}
    myMap.filter{it.value.startsWith("t")}.forEach{ (k,v) -> println("$k $v")}

}

