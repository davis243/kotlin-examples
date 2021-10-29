package pe.davis.kotlin

fun main() {
    //var name: String = null //not work, null is not a type of String
    var name : String? = null
    name = "Davis"
    println(name.toUpperCase())//not compile if name is null
    var surename : String? = null

   // if(surename != null)
   //    println(surename.toUpperCase())
    //println("$surename".toUpperCase())//print NULL

    println(surename?.toUpperCase()) //null Safe Operator
    //Non-Null Asserted Operator
    println(surename!!.toUpperCase()) //Null Pointer Exception

    var address = null// Nothing type
//    address = "Hello"// not work
    var myInteger :Int? = 7
    myInteger = null

}