//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val customer = Cliente(
            "Yolanda",
            "Hernandez",
            "Martinez",
            1234567,
            "SANTA FE"
        )
        printPerson(customer)

        val empleado = Empleado(
            "Oscar",
            "Chuc",
            "Colli",
            7894561,
            "GCBFHNJDG546",
            78.000,
            "Repartidor"
        )

        printPerson(empleado)

    }

    fun printPerson(person: customer) {
        println(person.printPersonType())
    }