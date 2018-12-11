package sample.edu.missouriwestern.cmcbane1.csc254.monsters;

public class Bat extends Animal implements Nocturnal{

    public Bat(){
        super();
        symbol = "\uD83E\uDD87";
        aggressiveness = 0.5;
        strength = 0.8;
        setStamina(0.5);
        attackMessage = "Attacks your neck for blood";
    }

    @Override
    public void changeMessages() {
        if(Attack.isNight() == false){
            passiveMessage = "Hangs from the ceiling sleeping";
        }
    }
}

