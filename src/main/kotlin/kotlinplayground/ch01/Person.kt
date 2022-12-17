package kotlinplayground.ch01

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val person = listOf(
        Person("영희", 30),
        Person("철수", 32),
        Person("태민", 30),
        Person("아무개", 38),
    )
    val oldest = person.maxBy { it.age ?: 0 } // 엘비스 연산자는 age가 null일 경우 0을 기본값으로 넣어준다.
    println("나이가 가장 많은 사람: $oldest") // 나이가 가장 많은 사람: Person(name=아무개, age=38)
}
