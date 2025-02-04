package collections

//You have a list of words. Use for and if to print only the words that start with the letter l

fun main(){
    val words = listOf<String>("dinosour","limousine","language","magazine")

    for(word in words){
        if(word[0] == 'l'){
            println(word)
        }
    }
}