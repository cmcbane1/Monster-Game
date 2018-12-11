package sample.edu.missouriwestern.cmcbane1.csc254.monsters;

public class FlyTrap extends Plant implements Nocturnal {

    public FlyTrap(){
        super();
        symbol = "\uD83D\uDCAE";
        aggressiveness = 1.0;
        strength = 1.0;
        setStamina(1.0);
        attackMessage = "Swallows you whole";
    }

    @Override
    public void changeMessages() {
        if(Attack.isNight() == false){
            passiveMessage = "Shrinks away in the light";
        }
    }
}

