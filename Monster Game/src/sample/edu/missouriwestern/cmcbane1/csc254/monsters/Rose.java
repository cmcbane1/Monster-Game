package sample.edu.missouriwestern.cmcbane1.csc254.monsters;

public class Rose extends Plant {

    public Rose(){
        super();
        symbol = "\uD83C\uDF39";
        aggressiveness = 0.3;
        strength = 0.2;
        setStamina(0.2);
        attackMessage = "Attacks with thorns";
    }
}

