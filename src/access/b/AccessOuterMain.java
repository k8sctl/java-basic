package access.b;

import access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지가 아니라서 default 호출 불가
        // data.defaultField = 2;
        // data.defaultMethod();

        // 같은 클래스가 아니라서 private 호출 불가
        // data.privateField = 3;
        // data.privateMethod();

        data.innerAccess();
    }
}
