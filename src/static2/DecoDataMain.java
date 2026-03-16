package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); // 이걸 여러번 계속해서 사용한다면
        DecoData.staticCall(); // import static을 사용할 수 있다.
        staticCall();          // 그러면 이렇게 클래스명을 생략하고 메서드를 호출할 수 있다.
        staticCall();
        staticCall();
        staticCall();


        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCall(data1);

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
