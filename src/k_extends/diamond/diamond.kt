package k_extends.diamond

abstract class Animal(val name: String)

interface Flyable {
    fun fly()

    // 본문이 존재하는 디폴트 메서드
    fun move(): Unit {
        println("납니다.")
    }
}
interface Swimmable {
    fun swim()

    // 본문이 존재하는 디폴트 메서드
    fun move() = println("헤엄칩니다.")
}

class Duck(name: String) : Animal(name), Flyable, Swimmable {
    override fun fly() {
        println("${name}가 납니다.")
    }

    override fun swim() {
        println("${name}가 헤엄칩니다.")
    }

    override fun move() {

        // 양쪽 인터페이스의 본문을 가진 메서드 중 구체적인 타입을 선택하여 호출
        super<Flyable>.move()   // Flyable의 move를 호출
        super<Swimmable>.move()   // Swimmable의 move를 호출

    }
}

fun main() {
    val duck = Duck("오리")
    duck.move()
    duck.swim()
}