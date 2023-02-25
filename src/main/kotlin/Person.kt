import java.util.*

data class Person(
    val id: Long,
    val title: String,
    val firstname: String,
    val surname: String,
    val dateOfBirth: Calendar?
) {
    override fun toString(): String {
        return "$firstname $surname"
    }

    val age: Int
        get() = getAge(dateOfBirth)

    companion object {
        fun getAge(dateOfBirth: Calendar?): Int {
            if (dateOfBirth == null) return -1
            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if (dateOfBirth.get(Calendar.YEAR) >= today.get(Calendar.YEAR)) -1
            else years
        }
    }
}

fun main() {

    val sd = Person(1, "hello", "vicky", "dinda", GregorianCalendar(1977, 4, 12))
    println("$sd age is ${sd.age}")
    println("fa1111sas")

}

