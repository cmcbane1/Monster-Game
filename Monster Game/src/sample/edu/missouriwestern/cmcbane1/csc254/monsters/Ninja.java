package sample.edu.missouriwestern.cmcbane1.csc254.monsters;

public class Ninja extends Warrior implements Nocturnal {
    @Override
    public void changeMessages() {
        double x = Math.random();
        if(Attack.isNight() == false) {
            passiveMessage = "Fades into the shadows";
            hidingNocturnalMessage = "Fades into the shadows";
        }else {
            if (x <= 0.25) {
                attackMessage = "Swings his Ninja sword expertly";
            }else{
                if(x > 0.25 && x <= 0.5){
                    attackMessage = "Shoots a poisoned dart from his blowgun";
                }else{
                    if (x > 0.5 && x <= 0.75){
                        attackMessage = "Bashes with his nunchucks";
                    }else{
                        if (x > 0.75){
                            attackMessage = "Flings a throwing star";
                        }
                    }
                }
            }
        }
    }
}
