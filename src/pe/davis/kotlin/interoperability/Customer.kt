package pe.davis.kotlin.interoperability

data class Customer ( val id: Long, val name: String)

class CustomerDatabase (){
    val customers = listOf(Customer(1, "Matt"),
        Customer(2, "James"),
        Customer(3, "Dane"),
        Customer(4, "Sally"))

    @Throws(IllegalAccessException::class)
    fun addCustomer(c: Customer){

        throw IllegalAccessException("You cannot add customer")
    }

    companion object {
        @JvmStatic
        fun helloWorld() = println("Hello World")
    }
}