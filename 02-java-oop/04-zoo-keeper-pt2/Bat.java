public class Bat extends Mammal {

    public Bat(int energyLevel){
        super(energyLevel);
    }

    public void attackTown(){
        System.out.println("Burn! Burn! Burn!");
        this.energyLevel -= 100;
    }
    public void eatHumans(){
        System.out.println("BLEGH!");
        this.energyLevel += 25;
    }
    public void fly(){
        System.out.println("Weeeeeeee");
        this.energyLevel -= 50;
    }
}
