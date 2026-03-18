package extends1.ex;

public class Book extends Item {

    // 멤버 변수
    private String author;
    private String isbn;

    // 생성자
    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    // 가격 반환
    public int getPrice() {
        return super.price;
    }

    // 정보 출력
    public void print() {
        System.out.println("이름: " + super.name + ", 가격: " + super.price);
        System.out.println("- 저자: " + author + ", ISBN: " + isbn);
    }
}
