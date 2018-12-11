package sample.edu.missouriwestern.cmcbane1.csc254.monsters;

public class Horse extends Animal{

    public Horse(){
        super();
        symbol = "\uD83D\uDC34";
        aggressiveness = 0.3;
        strength = 1.2;
        setStamina(4.5);
        attackMessage = "Tramples you with hooves";
    }
}

