package kotlinplayground.basics

fun main() {
 exploreWhile() // 0 1 2 3 4
 println()
 exploreDoWhile() // 0 1 2 3 4
}

fun exploreDoWhile() {
    var y = 0
    do{
        print("$y ")
        y++
    }while (y < 5)
}

fun exploreWhile() {
    var x = 0
    while(x < 5){
        print("$x ")
        x++
    }
}
