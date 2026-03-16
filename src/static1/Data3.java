package static1;

public class Data3 {

    public String name;
    public static int count; // static 변수로 선언

    public Data3(String name) {
        this.name = name;
        // Date3.count++; // 원래는 이게 맞는데, 생략 가능
        count++;
    }
}
