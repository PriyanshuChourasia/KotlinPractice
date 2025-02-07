package encapsulaton

//class Outer {
//    private val outerProperty  = "Outer Property"
//    fun outerM(){
//        println(outerProperty);
//    }
//    class Nested{
//        fun innerProperty() {
//            println("This is inner property")
//        }
//    }
//}


class Outer{
    private val outerProperty = "Outer Property"

    inner class Inner{
        fun innerFun(){
            println("Accessing outer property")
            println(outerProperty)
        }
    }
}


fun main(){
    val out = Outer().Inner()
    out.innerFun()
}