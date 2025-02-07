package kvm

// Kotlin visibility modifiers


//class PublicClass{
//    public var publicVariable: Int = 1
//
//    fun publicFunction(){
//        println("Public Function")
//    }
//}

//internal class InternalExample{
//    internal var internalvariable:Int = 12
//
//    internal fun internalFunction(){
//        println("Internal function")
//    }
//}

//open class ProtectedExample{
//    protected var protectedVar = 1
//    protected fun protectedFunction(){
//        println("Protected function")
//    }
//    open fun protectOpenFun(){
//        println("Protected Open function")
//    }
//}
//
//class SubClassExam: ProtectedExample(){
//    fun accessProtectedMember(){
//        println(protectedVar)
//        protectedFunction()
//    }
//}


open class Shape{
    open fun draw(){
        println("Draw a shape")
    }
}

class Circle() : Shape(){
    override fun draw() {
        super.draw()
    }
}

fun main(){

}