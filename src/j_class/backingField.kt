package j_class

// backingField
class People(name: String, var age: Int) {
    // 만약 입력받은 이름을 대문자로 사용하고 싶으면
    // 커스텀 게터 사용
    val name: String = name
        // get() = name.uppercase()     // 커스텀 게터 안에 무한루프에 빠지기 때문
        get() = field.uppercase()        // backingField 사용
        // 프로퍼티(게터 포함)이 아닌 필드 자기 자신을 가리키는 키워드
}

fun main() {
    val people = People("john", 30)
    people.name // getter 가 호출 => name.uppercase()
                // => name. => 커스텀 getter 를 호출
                // name.name.uppercase().name.uppercase().name.uppercase()...
                // 무한 루프에 빠지게 됨
    println(people.name)
}