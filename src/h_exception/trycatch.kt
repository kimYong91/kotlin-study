package h_exception

// 자바와 동일한 방식의 예외처리 try-catch-finally
fun main() {
    try {
      // 예외가 발생할 가능성이 있는 코드
        val numbers = listOf(1, 2, 3)
        numbers[10]
            // 타입 선언 순서 => 코틀린 방식
    } catch (e: IndexOutOfBoundsException) {
        // 예외가 발생 했을 때
        println(e.message)
        throw Exception("예외 발생")
    } finally {
        println("반드시 실행")
    }
}