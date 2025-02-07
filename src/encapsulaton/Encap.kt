package encapsulaton

//class Person{
//    var name: String
//    var age: Int
//
//    constructor(name: String, age: Int){
//        this.name = name
//        this.age = age
//    }
//    constructor(name: String){
//        this.name = name
//        this.age = 0
//    }
//}

//class Person{
//    var name: String = "Unknown"
//        get() = field
//        set(value) {
//            field = value
//        }
//    var age: Int = 0
//        get() = field
//        set(value) {
//            field = value
//        }
//}

class Rectangle{
    var width: Int = 0
    var height: Int = 0
    val area: Int

        get() = width * height
}

fun main(){

    val rec = Rectangle()
    rec.width = 23
    rec.height = 12

    println("Area = ${rec.area}")

//    var person = Person()
//    person.name = "Bob the builder"
//    person.age = 12
//
//    println("Name: ${person.name}")
//    println("Age: ${person.age}")


//    val person = Person("Alice",30)
//    val person2 = Person("Bob")
//    println("Name: ${person.name}, Age: ${person.age}")
//    println("Name: ${person2.name}, Age: ${person2.age}")
}