package gamespace;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.TimerTask;


public class Reservation  {
    private Player player;
    private Poste poste;
    public Horaire hour;
    private Game game;

    private double price;
    public static double PRICE = 0;



    public Reservation(){}
    public Reservation(Player pl,Poste po,Horaire h,Game g,double p){
        this.player = pl;
        this.poste  = po;
        this.hour   = h ;
        this.game   = g;
        this.price = p;
        PRICE+=p;
        this.poste.setDateEnd(this.hour.getTimeOfEnd());
    }

    //get start hour
    public LocalDateTime getStartDate(){return this.hour.getStartDate();}

    //run function every seconde to check

    public int returnMinute(){
        int numberMinute = this.hour.getDiffDate();
        if(numberMinute <= 0){
            this.poste.setPosteNonAvailable();
            //  JOptionPane.showMessageDialog(null, this.poste.getNamePoste()+" is available Now");
            numberMinute = 0;
        }
        return numberMinute;
    }
    /*
    Show infos about one reservation for a player X
     */
    public void showInfos(){
        int numberMinute = returnMinute();
        System.out.println("Code's Player ........ : "+this.player.getCodePlayer());
        System.out.println("Player's FirstName ... : "+this.player.getFirstNamePlayer());
        System.out.println("Player's LastName .... : "+this.player.getLastNamePlayer());
        System.out.println("Poste's Number ....... : "+(this.poste.getNumPoste()-1));
        System.out.println("Name's Number ........ : "+this.poste.getNamePoste());
        System.out.println("Hour Of Start Game ... : "+this.hour.getTimeOfStart());
        System.out.println("Hour Of End   Game ... : "+this.hour.getTimeOfEnd());
        System.out.println("Name's Game .......... : "+this.game.getNameOfGame());
        System.out.println("Minutes .............. : "+numberMinute+" minutes vous restes !!!");
        System.out.println("Price ................ : "+this.price+"DH");

    }

}
