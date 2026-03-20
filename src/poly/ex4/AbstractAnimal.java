package poly.ex4;

public abstract class AbstractAnimal {
    // 기능은 하나도 구현되어 있지 않고,
    // 모든 메서드가 추상 메서드로 구현되어 있는 클래스를 순수 추상 클래스라고 한다.

    public abstract void sound();

    public abstract void move();
}
