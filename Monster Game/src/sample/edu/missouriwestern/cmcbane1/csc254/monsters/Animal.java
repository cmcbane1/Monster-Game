package sample.edu.missouriwestern.cmcbane1.csc254.monsters;

public abstract class Animal extends Entity {
    public Animal (){
        this(1.0);
    }

    public Animal(double health){
        super();
        setSymbol();
        setHealth(health);
        setStamina(0.35);
        strength = 1.5;
        aggressiveness = 0.7;
        attackMessage = "Viciously bites";
    }
    private void setSymbol(){

        symbol = "\uD83D\uDC3A";
    }

}
