package collections

fun main(){
    val numbers = listOf<Int>(1,-23,0,4,5,-6,8)

    val positives = numbers.filter { x -> x > 0 }

    val negatives = numbers.filter { x:Int -> x < 0 }

    println(positives)
    println(negatives)

    println(listOf<Int>(4,2,3).fold(5) {x,item-> x+item  })
}