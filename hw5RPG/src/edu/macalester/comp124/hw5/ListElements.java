package edu.macalester.comp124.hw5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by Gozong on 3/17/14.
 */

public class ListElements {
    private String mapsDirectoryName = "hw5RPG/images";
    public List<Agent> monstersList = new LinkedList<>();
    public List<Agent> charactersList = new LinkedList<>();

    public ListElements(){

        charactersList.add(new Agent(mapsDirectoryName + "actor.png"));//Your mom
        charactersList.add(new Agent(mapsDirectoryName + "actor.png")); //Your brother
        charactersList.add(new Agent(mapsDirectoryName + "actor.png")); //The astronaut




    }
}
