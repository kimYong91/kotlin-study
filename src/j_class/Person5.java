package j_class;

public class Person5 {
    private String name;
    private int age;

    public Person5(String name, int age) {
        System.out.println("사람객체를 초기화 합니다.");
        this.name = name;
        this.age = age;
    }

    public Person5(String name) {
        this.name = name;
    }

    public Person5() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
