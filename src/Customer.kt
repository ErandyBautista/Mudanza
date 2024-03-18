abstract class customer(
    val names: String,
    val firstLastName: String,
    val secondLastName: String,
    val phoneNumber: Number
) {

    fun getFullName(): String {
        println("Escribra nombre completo")
        return "$names $firstLastName $secondLastName"
    }

    abstract fun printPersonType()
}
