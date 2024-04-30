package i_function;

public class JavaFun {
    // Java에서 매개변수를 다양하게 받고 싶을 떄
    public void repeat(String str, int num, boolean isNewLine) {
        for (int i = 0; i < num; i++) {
            if (isNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }
    // 오버로딩 활용하여 기본 값 지정
    public void repeat(String str) {
        repeat(str, 3, true);
    }

    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    public static void main(String[] args) {
        JavaFun javaFun = new JavaFun();
        javaFun.repeat("문자열", 3, true);
        javaFun.repeat("문자열");
    }
}