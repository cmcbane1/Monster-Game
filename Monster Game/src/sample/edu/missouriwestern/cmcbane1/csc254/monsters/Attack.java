package sample.edu.missouriwestern.cmcbane1.csc254.monsters;

import java.time.LocalTime;

public class Attack{

    /**
     *
     * An attack requires both the attacker and the defender to be alive.
     * If one or both are dead, then a "No Attack" message is returned.
     *
     * A random number between 0.0 <= 0.0 < 1.0.  If this number is less than the attacker's aggressiveness, then
     * an attack occurs.
     *     If the attack occurs the strength of the attack is calculated using the strength and stamina of the attacker.
     *     If no attack occurs the ccreature's attack message is returned.
     *
     * @param attacker
     * @param defender
     * @return A string giving the blow-by-blow
     */

    public static String attack(Entity attacker, Entity defender) {

        String message = "Nothing So far";

        if(attacker.isDead() || defender.isDead()){
            message = "One or both players are dead.  No attack";
        }else {
            if (attacker instanceof Nocturnal && isNight() == false) {
                message = attacker.getPassiveMessage();
            } else {
                if (defender instanceof Nocturnal && isNight() == true && Math.random() >= 0.5) {
                    message = defender.getHidingNocturnalMessage();
                } else {
                    boolean attack = Math.random() < attacker.getAggressiveness();
                    if (attack) {
                        double force = attacker.getStrength() * Math.random();
                        double damage = force / defender.getStamina();
                        defender.subtractHealth(damage);
                        message = String.format("%s %d %s with %d%% force and doing %d%% damage",
                                attacker.symbol, attacker.getId(), attacker.getAttackMessage(), (int) Math.round(force * 100),
                                (int) Math.round(damage * 100));
                    } else {
                        message = String.format("%s %d %s", attacker.symbol, attacker.getId(), attacker.getPassiveMessage());
                    }
                    if(defender instanceof Nocturnal && isNight() == true) {
                        message = "Attacker found Defender!\n" + message;
                    }
                }
            }
        }
        return message;
    }

    /**
     * This method has player1 attack player 2, and then player 2 attack player 1.
     *
     * @param player1
     * @param player2
     * @param round  This is an integer that indicates round number.  It is normally an incremented variable.
     *
     * There is no return value
     */

    public static void round(Entity player1, Entity player2, int round){
        System.out.println("\nRound " + round);
        System.out.println(Attack.attack(player1, player2));
        System.out.println(Attack.attack(player2, player1));
    }

    /**
     * Checks to see if it is night or not using local time.
     *
     * @return True if local time hour is before 6 or after 18 local time.
     */

    public static boolean isNight() {
        boolean night = false;
        LocalTime time = LocalTime.now();
        int currentHour = time.getHour();
        night = (currentHour < 6 || currentHour > 18);
        return night;
    }


}


