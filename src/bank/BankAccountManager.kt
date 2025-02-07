package bank

class BankAccount{
    private val accountNumber: String
    private var balance: Double
    private var accountHolderName: String = ""
    constructor(accountNumber: String, balance: Double){
        this.accountNumber = accountNumber
        this.balance = balance
    }

    fun getAccountHolderName(): String{
        return accountHolderName
    }

    fun setAccountHolderName(name:String){
        if(name.isNotEmpty()){
            accountHolderName = name
        }
    }

    fun getBalance(): Double{
        return balance
    }

    fun deposit(amount: Double){
        if(amount > 0){
            balance += amount
        }
    }

    fun withdraw(amount: Double){
        if(amount > 0 && amount <= balance)
        {
            balance -= amount
        }
    }

}

fun main(){
    val myAccount = BankAccount("123456678909",1200.56)
    myAccount.setAccountHolderName("Priyanshu Chourasia")
    println("Account Holder Name: ${myAccount.getAccountHolderName()}")
    println("Initial Balance: ${myAccount.getBalance()}")
    myAccount.deposit(600.56)
    println("Balance after deposit: ${myAccount.getBalance()}")
    myAccount.withdraw(278.32)
    println("Balance after withdrawal: ${myAccount.getBalance()}")
}