package o_data

enum class Direction(val code: String) {
    NORTH("북"), SOUTH("남"), EAST("동"), WEST("서");
}

fun main() {
    val north = Direction.NORTH

    println(north)
    println(north.code)

    // 분기 로직을 자체적으로 생성해야 함
    val direction = Direction.SOUTH
    if (direction == Direction.SOUTH) {
        println("${Direction.SOUTH.code}쪽으로 갑니다.")
    }
    if (direction == Direction.NORTH) {
        // 북쪽 관련 로직
    }

    handleDirection(Direction.SOUTH)
}
// Enum 클래스와 when 문을 함께 사용
// Enum 클래스를 매개변수로 받아 활용하는 메서드
// when 을 할 때 Enum 클래스에 만든 목록을 다 적도록 강제한다.
private fun handleDirection(direction: Direction) {
    when (direction) {
        Direction.NORTH -> println("북쪽")
        Direction.SOUTH -> println("남쪽")
        Direction.EAST -> println("동쪽")
        Direction.WEST -> println("서쪽")
    }
}