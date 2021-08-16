public class Gorilla extends Mammal {

    public void throwSomething(){
        System.out.println("Gorilla throws something");
        energyLevel -= 5;
    }
    public void eatBananas(){
        System.out.println("Gorilla eats bananas");
        energyLevel += 5;
    }
    public void climb(){
        System.out.println("Gorilla climbs");
        energyLevel -= 10;
    }
}
