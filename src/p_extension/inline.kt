package p_extension

inline fun Int.multiply(other: Int): Int {
    return this * other
}

fun main() {
    // inline 이 아닌 확장 함수는 내부적으로 static 함수를 만들어 호출
    println(3.multiply(4))
    // inline 함수는 내부적으로는 println(3 * 4)이것 처럼 함수를 호출하지 않고 그냥 계산한 것과 같음

}