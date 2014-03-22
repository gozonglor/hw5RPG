package edu.macalester.comp124.hw5;

import acm.program.ConsoleProgram;

/**
 * Created by Gozong on 3/21/14.
 */
public class TestingMap extends ConsoleProgram {

    Map map = new Map("main");
    private String mapsDirectoryName = "hw5RPG/maps/";
    public String[][] terrain;

    public TestingMap(){

        String terrainMapName = "main" + ".terrain.map";
        terrain = MapLoader.getMap(mapsDirectoryName + terrainMapName);
    for (int x=0; x < map.getWidth(); x++){
        //--- loop through the hashmap,NOTLOOPINGTHROUGHHASHMAP, for every key, find the matching key in the terrain map
        for (int y=0; y < map.getHeight(); y++){
            if (map.terrain[x][y].equals("^")){
                //println(map.terrain[x][y]+" oh dawg");
                map.terrain[x][y]="oh no";
            }
            //else{
            println(map.terrain[x][y]);
        }

}
    }
}
//}