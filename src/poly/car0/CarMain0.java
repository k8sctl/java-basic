package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car); // 이 시점부터 운전자(driver)는 k3Car 인스턴스의 참조값을 가지게 된다.
        driver.drive();

        // 추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); // 기존 K3Car의 참조를 제거한다.
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
