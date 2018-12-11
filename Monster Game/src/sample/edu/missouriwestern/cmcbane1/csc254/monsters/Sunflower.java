package sample.edu.missouriwestern.cmcbane1.csc254.monsters;

public class Sunflower extends Plant {

    public Sunflower(){
        super();
        symbol = "\uD83C\uDF3B";
        aggressiveness = 0.0;
        strength = 0.01;
        setStamina(0.1);
        attackMessage = "Blows gently in the breeze";
    }
}
