package pe.davis.kotlin

//By default the classes are public
class Customer {

    val name: String
    val address: String
    var age:Int = 21

    constructor(name: String , address: String, age: Int){
        this.name = name
        this.address = address
        this.age = age
    }
}
data class CostumerData ( val name: String, val address: String, val age:Int = 21) {

}
class CustomerWithDefaultConstructor ( val name: String, val address: String, val age:Int = 21)
class CustomerWithoutDefaultConstructor ( val name: String, val address: String, val age:Int = 21){}

class CustomerCallDefaultConstructor ( val name: String, val address: String, val age:Int = 21){

    constructor(name: String, age: Int): this(name, "", age){
        println("secondary constructor")
    }

    init{
        println("init block")
    }
}

class AlternativeCustomer(val name: String, var age:Int){
    var address: String
    init{
        address = ""
    }
    constructor(name:String , address: String, age: Int) : this(name, age){
        this.address = address
    }
}

class AnotherAlternativeCustomer( val name: String, val address: String,var age: Int){
    var approved: Boolean = false
    set(value){
        //approved = true // StackOverFlow Error
        if(age >= 21) {
            field = value
        }
        else {
            println("You can't approve a customer under 21 years old.")
        }
    }

    val nextAge
    get() = age + 1

    fun uppercaseName() = name.toUpperCase()

    override fun toString() = "$name $address $age"

    companion object {
        fun getInstance() = AnotherAlternativeCustomer("Davis","Address 2", 22)
    }
}

fun main() {
    val customer = Customer("David", "10 street",21)
    customer.age = 22
    println("${customer.name} is ${customer.age} years old")
    println()
    val customerD = CustomerCallDefaultConstructor("David", 21)
    println("${customerD.name} is ${customerD.age} years old")

    val customerA = AnotherAlternativeCustomer("David", "10 street",20)
    customerA.approved = true
    println("${customerA.name} is ${customerA.age} years old is approved ${customerA.approved}")
    println("next year ${customerA.uppercaseName()} will be ${customerA.nextAge} ")
    println(customerA)

    val costumerData = CostumerData("David","", 23)
    println(costumerData)
    val costumer5 = costumerData.copy(name= "Alexander")
    println(costumer5)

    val (name,address,age) = costumer5
    println(address)


}