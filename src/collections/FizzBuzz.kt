package collections

fun main(){

    var num = 0

    for(num in 1..100){
        if(num % 3 == 0){
            println("Fizz")
        }
        else if(num % 5 == 0){
            println("Buzz")
        }
        if(num % 3 == 0 && num % 5 == 0 ){
            println("FizzBuzz")
        }else{
            continue
        }
    }


    println("----------------------------------------------------------------")


    for(num in 1..100){
        when{
            num % 15 == 0 -> println("FizzBuzz")
            num % 3 == 0 -> println("Fizz")
            num % 5 == 0 -> println("Buzz")
        }
    }
}