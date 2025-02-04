package gameKot


fun main(args:Array<String>){
    val player = Player("Timo")
//    val player2 = Player("Louis")
    player.showDetails()
    println("----------------------------------------")
//    player2.showDetails()
    player.insertInfo(2,4,30)
    player.gameplay()
}