package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Pig()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    // 새로운 동물이 추가 되어도 아래 부분은 코드를 수정하지 않아도 된다.
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
