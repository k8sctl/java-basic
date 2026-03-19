package poly.basic;

// upcasting vs downcasting
public class CastingMain3 {

    public static void main(String[] args) {
        System.out.println("[업 캐스팅]");
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업 캐스팅은 (Parent) 생략 가능, 오히려 생략을 권장
        Parent parent2 = child;          // 업 캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();

        System.out.println();
        System.out.println("[다운 캐스팅]");
        Parent parent3 = new Child();
        ((Child) parent3).childMethod(); // 일시적 다운 캐스팅
    }
}
