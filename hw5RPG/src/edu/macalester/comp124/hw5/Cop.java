package edu.macalester.comp124.hw5;

/**
 * Created by Gozong on 3/26/14.
 */
public class Cop extends Player {

        String name;
        int health;

        public Cop(String name)
        {
            this.name = name;
        }

        public int getHealth(){
            return health;
        }


        public String getName() {
            return name;
        }

        public String toString() {
            return name + " " + health;
        }
    }



