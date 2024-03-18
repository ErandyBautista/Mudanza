class CustomerControllers(val printer: Printer) {
    private val customerList = mutableListOf<Cliente>()
    fun registerModel() {
        printer.apply {
            printMsg("Ingrese el nombre/nombres")
            val customerNames = readln()
            printMsg("Ingrese el primer apellido")
            val customerFirstLastName = readln()
            printMsg("Ingrese el segundo apellido")
            val secondLastName = readln()
            printMsg("Ingrese el número celular")
            val phoneNumber = readln().toLong()
            printMsg("Ingrese la dirección")
            val address = readln()
            val customer = Cliente(
                customerNames,
                customerFirstLastName,
                secondLastName,
                phoneNumber, address
                )
            customerList.add(customer)
            }
        }
        fun showAllModels() {
        }
    }
