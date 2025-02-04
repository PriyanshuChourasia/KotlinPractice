package collections

fun main(){

    val words = listOf<String>("dinosour","limousine","magazine","language")

    for(word in words){
        if(word[0] == 'l'){
            println(word)
        }
        else{
            continue
        }
    }
}