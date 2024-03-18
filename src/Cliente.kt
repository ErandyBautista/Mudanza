class Cliente(
    names: String,
    firstLastName: String,
    secondLastName: String,
    phoneNumber: Number,
    val address: String
    ) : customer(
        names,
        firstLastName,
        secondLastName,
        phoneNumber,
    )
        {
        override fun printPersonType() {
            println("Hola soy el cliente ${getFullName()}")
        }
        }