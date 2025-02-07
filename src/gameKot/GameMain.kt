package gameKot


fun main(args:Array<String>){
    val tim = Player("Tim")
    val louise = Player("Louise")
    tim.insertInfo(GamePlay(2,4,30))
    louise.insertInfo(GamePlay(2,4,27))


    tim.weapon = Weapon("Sword",23)
    louise.weapon = Weapon("Spear",24)

    louise.weapon = tim.weapon
    tim.weapon = Weapon("Spear",25)

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    val yellowPotion = Loot("Yellow Potion", LootType.POTION, 8.25)
    val ironArmor = Loot("Iron Armor", LootType.ARMOR,24.6)
    val greenRing = Loot("Green Ring", LootType.RING,30.00)

    tim.inventory.add(redPotion)
    tim.inventory.add(yellowPotion)
    louise.inventory.add(redPotion)
    tim.inventory.add(ironArmor)
    louise.inventory.add(greenRing)



    tim.gameplay()
    tim.playerInventory()
    println("----=======------------=======--------------==========--------===========------")
    louise.gameplay()
    louise.playerInventory()
}