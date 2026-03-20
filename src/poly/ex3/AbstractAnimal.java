package poly.ex3;

public abstract class AbstractAnimal {

    // 추상 클래스는 직접 인스턴스를 생성할 수 없다. 오직 상속을 위해서 생성하는 클래스
    // 추상 메서드가 하나라도 있는 클래스는 무조건 추상 클래스로 선언되어야 한다.
    // 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다.
    // 추상 메서드는 바디 부분이 없다. 바디 부분을 만들면 컴파일 에러가 발생한다.
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
