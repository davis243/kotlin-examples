package pe.davis.kotlin

import java.math.BigDecimal
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    var name: String = "David"
    //
    var middleName = "Alexander"// works without define type
    val surname: String = "Sarmiento"

    name =  "John"//works
    //surname = "Green"// inmutable, change doesn't work
    println(name + ""+ surname)// comes from io package

    println("Hello $name $surname")//String templates
    println("The \$name variable has ${name.length} characters")//String templates

    var story = """It was.
        |a dark night and stormy
        |a dark night and stormy
        """.trimMargin("|")
    println(story)

    story.reversed()
    println(story)
    //----------------------------------------------------
    val myDouble = 21.4
    println("-------------------------------------")
    println("Is myDouble a Double? ${myDouble is Double}")
    println("myDouble is a ${myDouble::class.qualifiedName}")
    println("myDouble's javaClass is a ${myDouble.javaClass}")

    val myInteger = myDouble.roundToInt()
    println("myInteger is a ${myInteger::class.qualifiedName}")

  //  val anotherInteger : Integer = 17 //not work
    val anotherInteger : Int = 17 //works
    val myFloat : Float = 13.2f
    val result = myFloat + anotherInteger
    println(result)

    val bd : BigDecimal = BigDecimal(7)
    val bd2 : BigDecimal //only declaration

    println("hello")
    bd2 = bd.add(BigDecimal(30)) // initialization
    //bd2 = bd.add(BigDecimal(30)) // not work because in the line before we initialize a inmutable variable
    println("hello $bd2")

}

