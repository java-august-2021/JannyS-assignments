public class BatTest {
    
    public static void main(String[] args) {
        Bat bart = new Bat(300);

        bart.attackTown();
        bart.attackTown();
        bart.attackTown();

        bart.eatHumans();
        bart.eatHumans();

        bart.fly();

        bart.displayEnergy();
    }
}
