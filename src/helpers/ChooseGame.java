package helpers;

import gamespace.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class ChooseGame {
    private ArrayList<Game>  games = new ArrayList<>() ;

    public ChooseGame(){
        this.games.add(new Game("FIFA.............."));
        this.games.add(new Game("PES..............."));
        this.games.add(new Game("COUNTER-STRIKE...."));
        this.games.add(new Game("ASSASSIN'S CREED.."));
    }

    //gett one games

    public Game displayGameCategory(Integer i){

        //display
        if(i == 1)
            System.out.println("------------------------ Football-Games ------------------------");
        else
            System.out.println("------------------------  Guerre-Games  ------------------------");

        //display games

        for(int j=0 ; j<this.games.size() ; j++){
            if (i == 1) {
                if (j == 2 || j == 3) {
                    continue;
                }

                System.out.println(j+" :"+this.games.get(j).getNameOfGame());
            } else {
                if (j == 0 || j == 1) {
                    continue;
                }

                System.out.println(j+" :"+this.games.get(j).getNameOfGame());
            }
        }

        //return games
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Number of Game You want : ");
        int index = Integer.parseInt(sc.nextLine());
        return this.games.get(index);
    }
}
