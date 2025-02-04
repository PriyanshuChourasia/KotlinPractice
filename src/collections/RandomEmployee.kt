package collections
import kotlin.random.Random

data class Employee(val name:String, var salary: Int)

class RandomEmployee(var minSalary: Int, var maxSalary: Int) {
    val names = listOf<String>("Vedika","Varsha","Rupesh","Priyanshu","Pradeep")

    fun randomEmpoyee() = Employee(names.random(),
        Random.nextInt(from = minSalary, until = maxSalary))
}

fun main(){
    val emp = RandomEmployee(10,50)
    println(emp.randomEmpoyee())
    println(emp.randomEmpoyee())
    println(emp.randomEmpoyee())
    println(emp.randomEmpoyee())
    emp.minSalary = 50
    emp.maxSalary = 100
    println(emp.randomEmpoyee())
}