package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        // 부모 변수가 자신 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();

        // 단, 자식의 메서드는 호출할 수 없다. 컴파일 에러 발생
        // poly.childMethod();

        // 다운 캐스팅 (부모 타입 -> 자식 타입)
        System.out.println("[다운 캐스팅]");
        Child child = (Child) poly;
        child.childMethod();

        // 일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        // 연산자 우선 순위가 타입 변환이 보다 .(점)을 이용한 참조가 더 높기 때문에
        // (Child) poly.childMethod() 가 아닌 ((Child) poly).childMethod() 같은 방법을 이용해야 한다.
        System.out.println("[일시적 다운 캐스팅]");
        ((Child) poly).childMethod();
    }
}
