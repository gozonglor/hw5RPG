package edu.macalester.comp124.hw5;

/**
 * Created by Gozong on 3/21/14.
 */
public class AttackMoves {

    Attack attack = new Attack();

    public static Attack getAttack(String attackName){
        Attack attack = new Attack();

        if (attackName.equals("Baton")){
            attack.name = "Baton";
            attack.damage = 3;
            attack.actionDescription = "beat the criminal with a baton!";
        }

        else if (attackName.equals("Pepper Spray")){
            attack.name = "Pepper Spray";
            attack.damage = 3;
            attack.actionDescription = "blasted a huge amount of pepper spray at the ";
        }

        else if (attackName.equals("Gun")){
            attack.name = "Gun";
            attack.damage = 0;
            attack.actionDescription = "shot ";
        }

        else if (attackName.equals("Super punch")){
            attack.name = "Super punch";
            attack.damage = 8;
            attack.actionDescription = "used super punch!";
        }

        else if (attackName.equals("Golden tooth smile")){
            attack.name = "Golden tooth smile";
            attack.damage = 8;
            attack.actionDescription = "flashed a golden tooth smile!";
        }

        return attack;
    }

}
