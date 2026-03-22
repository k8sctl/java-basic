package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        // K3 차량 선택
        Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // K3 -> Model3로 차량을 변경
        // Model3Car 클래스만 생성하고, Driver의 코드는 수정할 필요가 없다.
        Car model3Car = new Model3Car();
        driver.setCar(model3Car); // Driver의 car 변수의 참조값을 K3에서 Model3로 변경
        driver.drive();

        // Model3 -> NewCar로 변경
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
