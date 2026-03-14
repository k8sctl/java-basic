package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); // 0
        System.out.println("bigData.data = " + bigData.data);   // null

        // null.value로 접근하기 때문에 NullPointerException이 발생한다.
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
