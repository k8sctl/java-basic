package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // this()를 이용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다.
    MemberConstruct(String name) {
        this(name, 0, 0);
        // this()는 생성자 코드의 첫 줄에만 작성할 수 있다.
        // 그렇지 않은 경우 컴파일 에러가 발생한다.
    }

    // 생성자도 오버로딩이 가능하다.
    MemberConstruct(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 0;
    }

    // 생성자의 이름은 클래스의 이름과 같아야 한다.
    // 생성자는 반환 타입이 없다. 비워두어야 한다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출: name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
