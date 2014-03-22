package edu.macalester.comp124.hw5;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * An agent is an entity that can move around. Examples: player, NPCs, monsters.
 * You can add code here if you need something or you can make subclasses
 * of this. What's important here is that there's an ID. This is used by
 * the rendering system to determine which picture to draw for it.
 * @author baylor
 */
public class Agent
{
	public String type;	// tells us which picture to draw for this agent
	public int x, y;
    public String name;
    public int health;
    public boolean isHumanControlled = false;

    public List<Attack> attacks = new LinkedList<>();

	public Agent(String type)
	{
		this.type = type;
	}

    public String name()
    {
        return name;
    }

	/**
	 * The think() method is where agents decide what they're going to do.
	 * For this game, this normally means they decide where to move.
	 */
    public void think(){
        //do something
    }

    public void initialize(){
        health = 20;
        attacks.clear();
        attacks.add(AttackMoves.getAttack("Slap"));
        attacks.add(AttackMoves.getAttack("Haduken"));
        attacks.add(AttackMoves.getAttack("Run"));
    }

    public Attack getAction(Agent monster){
       if (isHumanControlled)
           return getHumanAction(monster);
        else
           return getAIAction(monster);
    }

    protected Attack getAIAction(Agent monster){
        if (attacks.isEmpty()){
            return null;
        }

        int numberOfAvailableAttacks = attacks.size();
        Random randomNumberGenerator = new Random(attacks.size());
        int attackNumber = randomNumberGenerator.nextInt(numberOfAvailableAttacks);
        return attacks.get(attackNumber);
    }

    protected Attack getHumanAction(Agent monsterOrNPC){
        System.out.println("Which attack do you want to use?" + "(0-" + (attacks.size()-1)+")");
        for (int i=0; i < attacks.size(); i++){
            Attack attack = attacks.get(i);
            System.out.print("(" + i + ")" + attack.name);
        }

        Scanner userInput = new Scanner(System.in);
        int choice = userInput.nextInt();
        Attack selectedAttack = attacks.get(choice);
        return selectedAttack;
    }

    public boolean hasFainted(){
        return (health <= 0);
    }

    public void takeDamage(int damage){
        health = health - damage;

        if (0 > health){
            health=0;
        }
    }
}
