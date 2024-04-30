package j_class

// 생성자
// 주 생성자 Primary Constructor : 클래스 이름 뒤에 선언
class person2 constructor(name: String, age: Int) {
    val name = name
    val age = age
}

// constructor() 키워드 : 생략 가능
class person3 (name: String, age: Int) {
    val name = name
    val age = age
}

// 클래스 프로퍼티 선언과 생성을 동시에 가능
// 자바의 20줄 이상의 코드가 1줄로 가능(이 방식을 많이 사용)
class person4 (val name: String,val age: Int)

// 주 생성자에서 초기화 시 로직이 필요한 경우
class person6 (val name: String,val age: Int) {
    // 초기화 블록
    init {
        println("사람 객체($name, $age)를 생성하였습니다.")
    }
}

// 코틀린에서 생성자를 여러개 만들 경우
class person7 (val name: String,val age: Int) {
    // 부 생성자

    // 부 생성자는 주 생성자를 보완하는 역할
    // 주 생성자를 호출 this()
    constructor(name: String) : this(name, 0)

    // 부 생성자는 하나 이상 정의 가능
    constructor() : this("무명", 0)
}

// 기본값만 주는 경우 부 생성자보다 default parameter 를 권장
class person8 (val name: String = "무명",val age: Int = 0)