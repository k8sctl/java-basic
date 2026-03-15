package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // 멤버 변수와 init()메서드의 파라미터의 이름이 다른 경우, this를 생략할 수 있다.
        // nameField = nameParameter;

        // 위처럼 this를 생략해도 되지만 코드를 명확히 하기 위해서 무조건 this를 사용하는 사람들도 있다.
        this.nameField = nameParameter;
    }
}