package final1;

public class ConstructInit {

    final int value;

    public  ConstructInit(int value) {
        this.value = value; // 생성자 이후의 멤버 변수의 값을 변경할 수 없다.
    }
}
