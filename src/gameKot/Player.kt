package gameKot

class Player(val name: String) {
    private var lives = 3
    private var level = 1
    private var score  = 0

    fun showDetails(){
        println("Name: $name")
        println("Lives: $lives")
        println("Level: $level")
        println("Score: $score")
    }

    fun insertInfo(lives:Int,level:Int,score:Int){
        this.lives = lives
        this.score = score
        this.level = level
    }

    fun gameplay(){
        println("Name: $name")
        println("Lives: $lives")
        println("Level: $level")
        println("Score: $score")
    }


}