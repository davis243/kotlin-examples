package pe.davis.kotlin

import java.io.FileInputStream

@Throws(InterruptedException::class)
fun divide(a: Int, b: Int): Double{
    Thread.sleep(1000)
    return (a.toDouble() / b)
}
fun printFile(){
    val input = FileInputStream("file.txt")

    input.use {
        //an exception could be throws here
        
    }
}
fun main() {
   /* try{
        println(7/0)
    }
    catch(e: ArithmeticException){
        println("caugh")
    }*/
    val result = try {
        divide(5,23)
    }
    catch(e: Exception){
        0
    }
    println(result)
}