package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        pulbicValue = 1;     // 모든 클래스 허용
        protectedValue = 1;  // 상속 관계 or 같은 패키지
        // defaultValue = 1; // 다른 패키지 접근 불가, 컴파일 오류
        // privateValue = 1; // 다른 클래스 접근 불가, 컴파일 오류


        publicMethod();     // 모든 클래스 허용
        protectedMethod();  // 상속 관계 or 같은 패키지
        // defaultMethod(); // 다른 패키지 접근 불가, 컴파일 오류
        // privateMethod(); // 다른 클래스 접근 불가, 컴파일 오류

        printParent();
    }
}
