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
    public int speed;
    public int strength;
    public char character;

    public List<Attack> attacks = new LinkedList<>();

	public Agent(String type, int health)
	{
		this.type = type;
        this.health = health;
	}

    public String getName()
    {
        return name;
    }

    public int getSpeed(){
        return speed;
    }

    public int getStrength(){
        return strength;
    }

	/**
	 * The think() method is where agents decide what they're going to do.
	 * For this game, this normally means they decide where to move.
	 */
    public void think(){
        //do something
    }

    public void takeDamage(Attack attack){
        health = health - attack.getDamage();

        if (0 > health){
            health = 0;
        }
    }

    public int initialize(){
        health = 20;
        attacks.clear();
        attacks.add(AttackMoves.getAttack("Pepper Spray"));
        attacks.add(AttackMoves.getAttack("Baton"));
        attacks.add(AttackMoves.getAttack("Gun"));

        return health;
    }

    //(1) Pepper Spray
    //(2) Baton
    //(3) Gun
    //Returns selected attack

    public Attack getAttack(){
        for (int i=0; i < attacks.size(); i++){
            System.out.println("(" + i + ")" + " " + attacks.get(i));
        }
        Scanner userInput = new Scanner(System.in);
        int choice = userInput.nextInt();
        Attack selectedAttack = attacks.get(choice);
        return selectedAttack;
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

    protected Attack getHumanAction(Agent monster){
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
