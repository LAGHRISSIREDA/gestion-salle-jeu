package gamespace;

public class Reservation {
    private Player player;
    private Poste poste;
    private Horaire hour;
    private Game game;

    private double price;
    public static double PRICE;

    public Reservation(Player pl,Poste po,Horaire h,Game g,double p){
        this.player = pl;
        this.poste  = po;
        this.hour   = h ;
        this.game   = g;
        this.price = p;
        //calculte price totale
        PRICE+=p;
    }

    /*
    Show infos about one reservation for a player X
     */
    public void showInfos(){
        System.out.println("Code's Player ........ : "+this.player.getCodePlayer());
        System.out.println("Player's FirstName ... : "+this.player.getFirstNamePlayer());
        System.out.println("Player's LastName .... : "+this.player.getLastNamePlayer());
        System.out.println("Poste's Number ....... : "+this.poste.getNumPoste());
        System.out.println("Name's Number ........ : "+this.poste.getNamePoste());
        System.out.println("Hour Of Start Game ... : "+this.hour.getTimeOfStart());
        System.out.println("Hour Of End   Game ... : "+this.hour.getTimeOfEnd());
        System.out.println("Name's Game .......... : "+this.game.getNameOfGame());
        this.hour.getDiffDate();
        System.out.println("Price ................ : "+this.price+"DH");

    }

}
