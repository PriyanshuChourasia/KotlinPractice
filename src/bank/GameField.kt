package bank

interface Team{
    fun addMember(member: String)
    fun getMember(): List<String>
}

class KolkataKnightRider() : Team{
    private val members : MutableList<String> = mutableListOf()
    override fun addMember(member: String) {
        members.add(member)
    }

    override fun getMember(): List<String> {
        return members.toList()
    }

    fun showMembers(){
        if(members.isEmpty()){
            println("No Members in the Team yet")
        }
        for (member in members){
            println(member)
        }
    }
}



fun main(){
    val team = KolkataKnightRider()
    team.showMembers()
    team.addMember("Russell")
    team.addMember("Gambhir")
    team.showMembers()

}