package kotlinplayground.basics

import kotlin.reflect.typeOf

fun main() {
    val name1 : String = "Pizza1"
    println(name1) // Pizza1
    // name1 = "GiveMorePizza"

    var name2 : String = "Pizza2"
    println(name2) // Pizza2

    var age1 : Int = 34
    println(age1) // 34

    age1 = 30
    println(age1) // 30

    /**
     * Kotlin has concept of Type inference(타입추론, https://kotlinlang.org/spec/type-inference.html)
     */
    var name3 = "I Like Pizza" // String, This is the same as -> var name3 : String = "I Like Pizza"
    var age = 30 // Int
    var distance = 30.0 // Double
    /**
     * In Kotlin, there is no distinction between primitive and wrapper types.
     */
}