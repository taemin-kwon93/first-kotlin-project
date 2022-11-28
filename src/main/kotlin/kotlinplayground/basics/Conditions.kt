package kotlinplayground.basics

fun main() {
    // if-else
    // when

    var name = "Alex"
    name = "Chloe"

    val result = if(name.length === 4){
        println("the name is four characters")
        name
    }else{
        println("the name isn't four characters")
        name
    }

    /** console
     * kotlin.Unit
     * The 'Unit' means represents a no value
     */
    println(result) // 12행과 15행에서 name을 주지 않으면, kotlin.Unit이 나온다.

    // 1 -> GOLS, 2 -> SILVER, 3 -> BRONZE
    var position1 = 2
    val medal1 = if(position1 == 1){
        "GOLD"
    }else if(position1 == 2){
        "SILVER"
    }else if(position1 == 3){
        "BRONZE"
    }else{
        "NO MEDAL"
    }
    println(medal1)

    position1 = 1
    // this is 'when' block
    val medal2 = when (position1) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println(medal2)
}