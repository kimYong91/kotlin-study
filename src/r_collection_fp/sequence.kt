package r_collection_fp

import kotlin.system.measureTimeMillis

// 시퀀스 : 지연 평가를 사용하여 데이터 컬랙션을 효율적으로 처리
// Java 의 Stream API 에 대응

fun main() {
    // 시퀀스 생성

    // 1. sequenceOf를 통한 생성
    val sep1: Sequence<Int> = sequenceOf(1, 2, 3, 4)

    // 2. 기존 컬랙션을 시쿼스로 변환
    val list: List<Int> = listOf(1, 2, 3, 4, 5)
    val sep2: Sequence<Int> = list.asSequence()

    // 사용할때는 최종연산 수행 후 사용
    println(sep1.toList())
    println(sep2.toList())

    // 컬렉션과 비교
    val largeList = (1..1_000_000).toList()

    // 컬렉션 연산
    // 즉시 평가(eager evolution)
    // 중간연산(filter, map)을 수행할 때마다 새로운 컬렉션을 반환
    val collectionTime = measureTimeMillis {
        largeList.filter { it % 2 == 0 }    // 50만대 리스트 반환
            .map { it * 2 }         // 50만개 리스트 반환
            .take(10)       // 컬렉션에서 앞 10개만 가져옴
            .toList()       // 10개 리스트 반환
    }
    println("collectionTime = ${collectionTime} ms")


    // 시퀸스 연산
    // 지연 평가 (Lazy Evaluation)
    // 최종연산이 실행될때까지 대기하고 필요한 연산만 수행
    val sequenceTime = measureTimeMillis {
        largeList.asSequence()
            .filter { it % 2 == 0 }     // take(10)을 확인 후 10개만 필터린
            .map { it * 2 }         // 10개만 반환
            .take(10)       // 컬렉션에서 앞 10개만 가져옴
            .toList()       // 지연 연산
    }
    println("sequenceTime = ${sequenceTime} ms")
}