package m_object

// 상수
class Constants {
    // 자바에서는 public static final
    // 클래스 내부레 정의되는 상수는 companion object 내부에
    // const val 키워드로 정의되고 관례적으로 모두 대문자를 사용한다.
    companion object {
        const val PI = 3.14159
    }
}