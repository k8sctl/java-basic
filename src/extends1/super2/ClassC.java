package extends1.super2;

public class ClassC extends ClassB {

    // 생성자가 하나도 없으면 기본 생성자가 자동으로 생성되지만,
    // ClassB는 사용자가 직접 생성자를 정의했기 때문에
    // 기본 생성자가 자동으로 생성되지 않는다.
    // 따라서 super()를 이용해서 부모 클래스의 생성자를 직접 호출해주어야 한다.

    public ClassC() {
        super(10, 20); // ClassB의 생성자를 직접 호출
        System.out.println("ClassC 생성자");
    }
}
