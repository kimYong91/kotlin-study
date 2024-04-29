package f_excercise

fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    println(list)
    list.add(6)
    println(list)
    list[1] = 10
    println(list)
    list.removeLast()
    println(list)

}
/*
### 연습문제 3: 리스트 조작

문제:
리스트를 생성하고, 이 리스트에 여러 작업을 수행하여 결과를 출력하세요.

요구사항:
1. 정수 리스트 `numbers`를 생성하고 초기값으로 `[1, 2, 3, 4, 5]`를 할당하세요.
2. 리스트에 숫자 `6`을 추가하세요.
3. 리스트의 두 번째 위치에 숫자 `10`을 삽입하세요.
4. 리스트의 마지막 요소를 제거하고, 결과를 출력하세요.

실행 예시:
```
초기 리스트: [1, 2, 3, 4, 5]
수정 후 리스트: [1, 10, 2, 3, 4, 6]
마지막 요소를 제거한 리스트: [1, 10, 2, 3, 4]
```
 */