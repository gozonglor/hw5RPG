package edu.macalester.comp124.hw5;

import java.util.Random;

/**
 * Created by Gozong on 3/21/14.
 */
public class AttackEngine {
    private Random randomNumberGenerator = new Random();

    public void executeAttack(Agent player, Agent monster){
        System.out.println(player.name + "'s turn");
        Attack attack = player.getAttack();
        int damage = attack.getDamage();

        if (monster.getSpeed() > player.getSpeed()){

            System.out.println("Too late! The" + monster.getName() + "made a move first.");
            attack = monster.getAIAction(monster);
            damage = attack.getDamage();
        }

        player.takeDamage(damage);


    }

}
