package pe.davis.kotlin.javaperson

import java.util.*

data class KotlinPerson( val id: Long,
                    val title: String,
                    val firstname: String,
                    val surname: String,
                    val dateOfBirth:Calendar?
) {
    var favoriteColor : String? = null

    fun getUpperCaseColor() : String {
        return favoriteColor?.toUpperCase() ?: "" //if (favoriteColor == null) "" else favoriteColor.toUpperCase()
    }

    fun getLastLetter(a: String) = a.takeLast(1)

    fun getLastLetterOfColor() : String {
        return favoriteColor?.let{getLastLetter(it) } ?: ""//if(favoriteColor == null) "" else getLastLetter(favoriteColor)
    }

    fun getColorType() : String {
        val color = getUpperCaseColor()
//        return if(color == "")
//            "empty"
//        else  if(color == "RED" || color == "BLUE" || color == "GREEN")
//            "rgb"
//        else
//            "other"
        return when (color) {
            "" -> "empty"
            "RED", "GREEN", "BLUE" -> "rgb"
            else -> "other"
        }

    }

    override fun toString() = "$title $firstname $surname"

    val age: Int
        get() = getAge(dateOfBirth)

    val safeAge: Int
     get() = age?: -1

    companion object{
        fun getAge(dateOfBirth: Calendar?):Int{
            if(dateOfBirth == null) return -1
            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if(dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR))  years - 1 else years

        }
    }
}

fun main() {
    val john = KotlinPerson(1L, "Mr","John","Blue", GregorianCalendar(1997,9,3))
    val jane = KotlinPerson(2L, "Mr","Jane","Blue", null)

    println("$john's age is ${john.age}")
    println("$jane's age is ${jane.age}")
    println("The age of someone born on 3rd May 1988 is ${KotlinPerson.getAge(GregorianCalendar(1988,5,3))}")

    val olderPerson = if( john.safeAge > jane.safeAge) john else jane
    println("The older person was $olderPerson")



}