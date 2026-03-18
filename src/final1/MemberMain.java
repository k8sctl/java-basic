package final1;

public class MemberMain {

    public static void main(String[] args) {
        Member member1 = new Member("myId", "kim");
        member1.print();
        member1.changeData("myId2", "lee");
        member1.print();
    }
}
