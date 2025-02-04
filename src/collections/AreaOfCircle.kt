package collections

import kotlin.math.PI

fun areaOfCircle(radius:Int): Double{
    return PI * radius * radius
}

fun circleArea (r:Int): Double = PI * r * r


fun main(){
    println(areaOfCircle(4))

    println(circleArea(4))
}