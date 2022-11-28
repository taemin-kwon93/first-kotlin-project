package kotlinplayground.basics

fun main() {
    /**
     * 코틀린에서는 '..' 과 같이 dot을 두번 연달아 사용하고 양쪽에 수를 적어주면,
     * 1 부터 10이라는 의미를 부여 할수있다.
     * 반대의 경우 downTo를 사용한다.
     * 1 .. 10 은 1부터 10까지를 의미하고
     * 10 downTo 1은 10부터 1까지를 의미한다.
     */

    val range1 = 1..10
    println(range1) // 1..10
    println()

    for(i in range1){
        print("$i ") // 1 2 3 4 5 6 7 8 9 10
    }
    println()

    val range2 = 10 downTo 1
    for(j in range2){
        print("$j ") // 10 9 8 7 6 5 4 3 2 1
    }
    println()

    for(i in range2 step 2){
        print("$i ") // 10 8 6 4 2
    }
    println()

    for(i in range2 step 3){
        print("$i ") // 10 7 4 1
    }
}