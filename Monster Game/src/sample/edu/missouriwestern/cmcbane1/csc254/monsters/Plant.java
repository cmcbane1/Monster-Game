package sample.edu.missouriwestern.cmcbane1.csc254.monsters;

public abstract class Plant extends Entity {
    public Plant (){
        this(1.0);
    }

    public Plant(double health){
        super();
        setSymbol();
        setHealth(health);
        setStamina(22.0);
        strength = 0.01;
        aggressiveness = 0.0;
        attackMessage = "Stands there like a tree";
    }
    private void setSymbol(){

        symbol = "\uD83C\uDF33";
    }
}
