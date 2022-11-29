package kotlinplayground.basics

fun main() {
    label1()
    println()
    label2()
    println()
    label3()
}

fun label1() {
    loop@ for(i in 1..5){
        println("i in label1 $i")
        if(i == 3) break@loop
    }
}

fun label2() {
    outerloop@for(i in 1..5){
        innerloop@ for(j in 1..3){
            println("j in label2 $j")
            if(j == 2) break@innerloop
            if(i == 3) break@outerloop
        }
    }
}

fun label3() {
    outerloop@for(i in 1..5){
        innerloop@ for(j in 1..3){
            println("j in label3 $j")
            if(j == 3) continue@outerloop
            if(i == 3) break@outerloop
        }
    }
}