package o_data

sealed interface Clickable {
    fun click()
}

sealed interface Focusable{
    fun focus()
}

class Button : Clickable, Focusable {
    override fun click() {
        println("버튼이 클릭 되었습니다.")
    }

    override fun focus() {
        println("버튼이 포커스 되었습니다.")
    }
}

class TextFiled : Focusable {
    override fun focus() {
        println("텍스트 창이 포커싱 되었습니다.")
    }
}

fun main() {
    val button = Button()
    button.focus()
    button.click()

    val textFiled = TextFiled()
    textFiled.focus()

    handleFocus(button)
    handleFocus(textFiled)
}

fun handleFocus(focusable: Focusable) {
    when (focusable) {
        is Button -> println("버튼 포커싱")
        is TextFiled -> println("텍스트필드 포커싱")
    }
}