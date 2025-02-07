package bank

open class Rectangle{
    open fun draw(){
        println("Drawing a rectangle")
    }
    val borderColor: String = "Red"
}

class FilledRectangle: Rectangle(){
    override fun draw() {
        val filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler{
        fun fill(){
            println("Filling")
        }
        fun drawAndFill(){
            super@FilledRectangle.draw()
            fill()
            println("Drawn a filled rectangle")
        }
    }
}


fun main(){
    val rec = FilledRectangle().Filler()
    rec.fill()
    rec.drawAndFill()
}