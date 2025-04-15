package org.example

class App { 
    var cantidad = 5
    var mitades = 2
    val total: Int /* se crea una variable que obtiene su valor de la función get()*/
        get() {
            return cantidad*mitades /*la función get() ejecuta la multiplicación de dos variables, el resultado se almacena en total*/
        }
}

fun main () { /*se crea la función main() para ejecutar el programa - IMPORTANTE PONER LOS () LUEGO DE DECLARALA*/
    println (App().total) /*se crea un objeto de la clase App y se imprime el valor de la variable total*/
}