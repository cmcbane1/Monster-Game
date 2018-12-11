package sample.edu.missouriwestern.cmcbane1.csc254.monsters;

public class PolarBear extends Animal {

    public PolarBear(){
        super();
        symbol = "\uD83D\uDC3B";
        aggressiveness = 0.7;
        strength = 1.9;
        setStamina(3.0);
        attackMessage = "Attacks with a snowy paw";
    }
}

