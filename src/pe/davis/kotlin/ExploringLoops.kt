package pe.davis.kotlin

import pe.davis.kotlin.javaperson.KotlinPerson

fun main() {
/*    var x : Int = 0
    while(x < 10){
        println(x)
        x++
    }*/

    val people = ArrayList<KotlinPerson>()
    people.add(KotlinPerson(1, "Mr", "James", "Apple", null))
    people.add(KotlinPerson(2, "Mrs", "Sophie", "Orange", null))
    people.add(KotlinPerson(3, "Mrs", "Anita", "Kimkvat", null))
    people.add(KotlinPerson(3, "Mrs", "Daren", "Banana", null))

   /* for( person : KotlinPerson in people){
        println(person)
    }*/
/*     for( person in people){
         val (id, title) = person
        println("$person has $id")
    }*/

    for( (id, title, firstname) in people){ //KotlinPerson must be a =>  data class

        println("$title $firstname has id $id")
    }
    val peopleMap = HashMap<Int, KotlinPerson>()
    peopleMap.put(1, KotlinPerson(1, "Mr", "James", "Apple", null))
    peopleMap.put(2,KotlinPerson(2, "Mrs", "Sophie", "Orange", null))
    peopleMap.put(3,KotlinPerson(3, "Mrs", "Anita", "Kimkvat", null))
    peopleMap.put(4,KotlinPerson(3, "Mrs", "Daren", "Banana", null))

    for((key, value) in peopleMap){
        println("$value has key $key")
    }

    val myRange = 0..9
    for(i in myRange){

    }
    for(i in 0..9){
        println(i)
    }
    println()
    (0..9).forEach{ print(it)}//0123456789
    println()
    (9 downTo 0).forEach{print(it)}//9876543210
    println()
    (0 until 9).forEach{print(it)}// 012345678
    println()
    (0..9 step 2).forEach{print(it)}//02468
    println()
    ('A'..'F').forEach {print(it)}//ABCDEF
}
