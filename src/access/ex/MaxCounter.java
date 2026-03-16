package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    /*
    public MaxCounter(int max) {
        this(0, max);
    }

    public MaxCounter(int count, int max) {
        this.count = count;
        this.max = max;
    }
    */

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
       /*
       if (count >= max) {
            System.out.println("최댓값을 초과할 수 없습니다. 현재 count 값: " + count);
        } else {
            count++;
        }
        */

        // 검증 로직
        if (count >= max) {
            System.out.println("최댓값을 초과할 수 없습니다. 현재 count 값: " + count);
            return;
        }

        // 실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }
}
