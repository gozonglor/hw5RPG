package edu.macalester.comp124.hw5;

import java.util.Random;

/**
 * Created by Gozong on 3/21/14.
 */
public class AttackEngine {
    private Random randomNumberGenerator = new Random();
    public void executeAttack(Agent player, Agent monster){
        System.out.println(player.name + "'s turn");

        Attack attack = player.getAction(monster);
        int damage = calculateBaseDamage(attack);

        //--- If the monsters speed is faster or equal to your speed,
        //--- you have a higher chance of missing

        //---
        //---



    }

    private int calculateBaseDamage(Attack attack){
         int range = (attack.maxDamage - attack.minDamage + 1);
         int damage = randomNumberGenerator.nextInt(range) + attack.minDamage;
         return damage;
    }
}
