package sample.edu.missouriwestern.cmcbane1.csc254.monsters;

public class Warrior extends Human{

    public Warrior(){
        super();
        symbol = "\uD83D\uDC82";
        aggressiveness = 1.0;
        strength = 1.4;
        setStamina(1.0 + Math.random());
        attackMessage = "Attacks skillfully with a sword";
    }
}
