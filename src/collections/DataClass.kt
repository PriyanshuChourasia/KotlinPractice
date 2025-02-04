package collections


data class PreviousEmployee(
    val name:String,
    var salary: Int,
)


data class Name(val firstName: String, val lastName:String)
data class City(val city: String , val countryCode: String)
data class Address(val address:String,val city: City)

data class Person(val name:Name, val address: Address, val ownsAPet: Boolean = true)


fun main(){
    val emp = PreviousEmployee("Priyanshu",1200)
    println(emp)
    emp.salary += 100

    println(emp)

    val person = Person(Name("John","Smith"),
        Address("123 Fake Street",
            City("Spring Field","US")),
        ownsAPet = false)

    println(person.name.firstName)

}