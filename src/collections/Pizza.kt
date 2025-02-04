package collections

/***
 * You have a program that counts pizza slices until there’s a whole pizza with 8 slices. Refactor this program in two ways:
 * ***/

fun main(){
    var pizzaSlices = 0

    while(pizzaSlices < 9){

        println("There's only $pizzaSlices slice/s of pizza")
        pizzaSlices++;
    }

    println("-------------------------------------------------------")

    pizzaSlices = 0

    do {
        println("There is only $pizzaSlices slice/s of pizza")
        pizzaSlices++
    }while (pizzaSlices < 9)
}