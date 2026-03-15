package pack;

// import pack.a.User;
// import pack.a.User2;

import pack.a.*; // 이렇게 하면 pack.a 패키지에 있는 모든 클래스를 패키지명을 생략하고 사용할 수 있다.

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import 사용으로 패키지명 생략 가능
        User2 user2 = new User2();
    }
}
