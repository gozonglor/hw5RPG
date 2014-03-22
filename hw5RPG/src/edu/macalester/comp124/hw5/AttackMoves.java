package edu.macalester.comp124.hw5;

/**
 * Created by Gozong on 3/21/14.
 */
public class AttackMoves {

    Attack attack = new Attack();

    public static Attack getAttack(String attackName){
        Attack attack = new Attack();

        if (attackName.equals("Slap")){
            attack.name = "Slap";
            attack.minDamage = 1;
            attack.maxDamage = 2;
            attack.actionDescription = "slaps";
        }

        else if (attackName.equals("Haduken")){
            attack.name = "Haduken";
            attack.minDamage = 12;
            attack.maxDamage = 18;
            attack.actionDescription = "blasted a huge amount of energy at";
        }

        else if (attackName.equals("Run")){
            attack.name = "Run";
            attack.minDamage = 0;
            attack.maxDamage = 0;
            attack.actionDescription = "runs away from";
        }

        return attack;
    }

}
