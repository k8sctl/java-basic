package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 생성자를 private 접근 제어자로 막는다.
        // 이렇게 하면 인스턴스 생성을 막을 수 있다.
    }

    // 배열의 총합을 구하는 메서드
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    // 배열의 요소의 평균을 구하는 메서드
    public static double average(int[] values) {
        return (double) (sum(values) / values.length);
    }

    // 아래 최솟값, 최댓값에 대한 경우, 배열의 0번째 요소와 0번째 요소를 비교하기 때문에
    // 알고리즘상 조금 성능이 떨어지기는 하지만 현재는 크게 신경쓰지 않도록 한다.

    // 배열의 최솟값을 구하는 메서드
    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue)
                minValue = value;
        }
        return minValue;
    }

    // 배열의 최댓값을 구하는 메서드
    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue)
                maxValue = value;
        }
        return maxValue;
    }
}
