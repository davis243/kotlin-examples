package pe.davis.kotlin.interfaces

import java.lang.RuntimeException
import java.math.BigDecimal

interface BookingManager {

    val version : String
    fun isSeatFree(seat: Seat): Boolean
    fun reserveSeat(seat: Seat, customerID: Long): Boolean
    fun systemStatus() = "All Operations are Functional"
}

open class BasicBookingManger(authorizationKey : String) : BookingManager {

    override val version = "1.0 "
    override fun isSeatFree(seat: Seat) = true
    override fun reserveSeat(seat: Seat, customerID: Long) = false
    init {
        if(authorizationKey == "12345") throw UnAuthorizationUserException()
    }
}

class UnAuthorizationUserException : Throwable()

class AdvancedBookingManager : BasicBookingManger("1234"), java.io.Closeable {
    override val version = "2.0"

    fun howManyBookings() = 10
    override fun close() {
        TODO("Not yet implemented")
    }

}

fun String.toSentenceCase():String {
    return this[0].toUpperCase() + this.substring(1)
}

fun main() {
    AdvancedBookingManager().isSeatFree(Seat(1,1, BigDecimal.ZERO, ""))

    val greeting = "welcome the system"

    println(greeting.toSentenceCase())
}