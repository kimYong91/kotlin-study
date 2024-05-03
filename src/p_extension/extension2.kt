package p_extension

// 만약 원래 기본 멤버 함수와 확장함수의 시그니처가 같은 경우

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}


// 멤버 함수(자바 Person 에 있음)가 우선적으로 호출됨
fun main() {
    val person = Person("홍길동", 30)
    println(person.nextYearAge())
}