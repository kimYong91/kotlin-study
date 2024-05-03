package p_extension

// 확장함수 오버라이딩

open class Train(val name: String = "새마을호", val price: Int = 30000)

fun Train.isExpensive(): Boolean {
    println("Train 클래스의 확장함수, 35000원보다 비싸면 true")
    return this.price >= 35000
}

class Ktx : Train("KTX", 45000)

fun Ktx.isExpensive(): Boolean {
    println("Ktx 클래스의 확장함수, 35000원보다 비싸면 true")
    return this.price >= 35000
}

fun main() {
    val train : Train = Train()
    println(train.isExpensive()) // train 클래스 확장함수

    // 코틀린에서 확장함수는 오버라이딩 될 수 없음
    // 수신 객체 변수의 타입에 따라 확산 함수가 호출
    val ktx1: Train = Ktx()     // 자바의 다형성에서는 객체의 오버라이딩 된 메서드가 우선됨.
    println(ktx1.isExpensive()) // train 클래스 확장함수

    val ktx2: Ktx = Ktx()  // 실제 참조 인스턴스가 아닌 객체의 타입에 따라 함수를 사용
    println(ktx2.isExpensive()) // Ktx 클래스 확장함수
}