package k_extends

interface Movable {
    fun move()                          // 본문이 없는 추상 메서드
    fun describe() = "움직일 수 있다."    // 본문이 있는 추상 메서드
}

// 구현 클래스
class Bike : Movable{
    override fun move() {
        println("자전거로 이동합니다.")
    }
}

class Taxi : Movable{
    override fun move() {
        println("택시로 이동합니다.")
    }

    // 디폴트 메서드 오버라이딩 : 선택적으로 오버라이딩 가능
    override fun describe(): String {
        return "택시는 질주하며 움직입니다."
    }
}

fun main() {
    val bike = Bike()
    val taxi = Taxi()

    // 코틀린에서 공통 인터페이스에 대한 추론이 가능하면 안적어도 됨 예) <Movable>
    val listOf = listOf<Movable>(bike, taxi)

    for (movable in listOf) {
        movable.move()      // 추상 메서드 호출
        println(movable.describe()) // 디폴트 메서드 호출
    }
}