package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("[Parent -> Parent]");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("[Child -> Child]");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("[Parent -> Child]");
        Parent poly = new Child();
        poly.parentMethod();
        // 그러나 자식 클래스의 메서드를 호출할 수는 없다.
        // poly.childMethod();

        // 자식 변수는 부모 인스턴스를 참조할 수 없다. (컴파일 에러)
        // Child child1 = new Parent();
    }
}
