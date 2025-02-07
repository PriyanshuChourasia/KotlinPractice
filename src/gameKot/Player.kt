package gameKot

data class GamePlay(
    var lives:Int,
    var levels:Int,
    var score:Int,
)

class Player(val name: String) {
    private var game = GamePlay(3,1,0)
    var weapon = Weapon("Hammer",1)
    var inventory: MutableList<Loot> = mutableListOf<Loot>()
    var sum: Double = 0.0

    fun showDetails(){
        println("Name: $name")
        println("Lives: "+ this.game.lives)
        println("Level: "+ this.game.levels)
        println("Score: "+ this.game.score)
    }

    fun insertInfo(game: GamePlay){
        this.game.lives = game.lives
        this.game.score = game.score
        this.game.levels = game.levels
    }

    fun gameplay(){
        println("Name: $name")
        println("Lives: "+ this.game.lives)
        println("Level: "+ this.game.levels)
        println("Score: "+ this.game.score)
        println("Weapon Name: ${weapon.name.uppercase()}")
        println("Weapon Damage: ${weapon.damageInflicted}")
    }

    fun weaponInfo(){
        println("Weapon Name: ${weapon.name.uppercase()}")
        println("Weapon Damamge: ${weapon.damageInflicted}")
    }


    fun playerInventory(){
        println("-----------------------------------------")
        for(material in inventory){
            println("Loot Potion: "+ material.name)
            println("Loot Type:  "+ material.type)
            println("Loot Value: "+ material.value)
            sum = sum + material.value
            println("==================================")
        }

        println("Loot Sum:  $sum")
        caluateWinner(sum)
    }

    fun caluateWinner(sum: Double){
        if(sum > 40.12){
            println("Winner")
        }else{
            println("Loser")
        }
    }


}