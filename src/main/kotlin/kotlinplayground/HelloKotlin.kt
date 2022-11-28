package kotlinplayground

class HelloKotlin {
}

fun main(args: Array<String>){

    val introduce: String = "this is Tom";
    println("Hello $introduce") // Hello this is Tom
    println("Hello ${introduce.length}") // Hello 11

    val multiLine1 = "\nABC\nDEF\n";
    println(multiLine1);
    /** console
     * ABC
     * DEF
     */

    val multiLine2 = """
        ABC
        DEF
        GHI
        $introduce
        ${introduce.length}
    """.trimIndent()
    println(multiLine2)
    /** console
     * ABC
     * DEF
     * GHI
     * this is Tom
     * 11
     */
}