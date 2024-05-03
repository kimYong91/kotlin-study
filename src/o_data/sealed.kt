package o_data

// 'sealed' : 봉인된
// 상속이 가능한 클래스를 만들고 싶지만, 외부에서는 상속받지 않으면 좋겠다.
// 정의된 패키지 내부에서만 상속이 가능한 클래스
// 제한된 상속 => 코드의 응집력을 높인다.

sealed class Transport(val name: String, val maxSpeed: Int)

class Car : Transport("아반뗴", 120)
class Bus : Transport("타요", 130)
class Bicycle : Transport("씽씽이", 30)
object Tank : Transport("전차", 50)   // 실글톤 객체도 상속 가능


// when 문에서 모든 가능한 하위 클래스 타입을 컴파일 시점에 체크
// 같은 페키지 다른 클래스에 있는 Transport를 상속한 클래스도 인지 하여 컴파일 시점에 when에 적도록 강제
fun handleTransport(transport : Transport) {
    when(transport) {
        is Bicycle -> println("${transport.name}이 ${transport.maxSpeed}로 들판길을 달립니다.")
        is Bus -> println("${transport.name}이 ${transport.maxSpeed}로 버스 전용차선으로 달립니다..")
        is Car -> println("${transport.name}이 ${transport.maxSpeed}로 차도를 달립니다.")
        Tank -> println("${transport.name}이 ${transport.maxSpeed}로 험한길을 달립니다.")
                // 클래스가 아닌 익명객체와 같아 타입 체크를 할 필요가 없다. 그래서 is를 쓰지 않는다.
        is Bike -> TODO()
    }
}

fun main() {
    handleTransport(Tank)
    handleTransport(Bus())

}