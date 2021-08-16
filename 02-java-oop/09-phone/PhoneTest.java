public class PhoneTest {
    public static void main(String[] args){
        Galaxy one = new Galaxy ("");
        Iphone two = new Iphone("");

        one.displayInfo();
        System.out.println(one.ring());
        System.out.println(one.unlock());

        two.displayInfo();
        System.out.println(two.ring());
        System.out.println(two.unlock());
    }
}
