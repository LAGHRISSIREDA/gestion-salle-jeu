import gamespace.*;
import helpers.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) {
        //declaration
        int choix1,minutes;
        String firstName,lastName;
        Poste poste = new Poste();
        Game game = new Game();
        double price;

        ChoosePoste choosePoste = new ChoosePoste();
        ChooseGame chooseGame = new ChooseGame();
        ChooseHour chooseHour = new ChooseHour();
        ChooseCategorie chooseCategory = new ChooseCategorie();
        ChoosePrice choosePrice = new ChoosePrice();
        ArrayList<Reservation> reservations = new ArrayList<>();



        do{
            System.out.println(" ************************ Here we gO ************************ ");
            System.out.println("Tape (1) For Reservation ................... :");
            System.out.println("Tape (2) For Display all ................... :");
            System.out.println("Tape (3) To Get TotalPrice ................. :");
            System.out.println("Tape (4) Display only Available-Poste ...... :");
            Scanner sc = new Scanner(System.in);
            choix1 = Integer.parseInt(sc.nextLine());
            switch (choix1){
                case 1:
                    //player infos
                    System.out.println("Your FirstName ......... : ");
                    firstName = sc.nextLine();
                    System.out.println("Your LaststName .......... : ");
                    lastName = sc.nextLine();
                    Player player = new Player(firstName,lastName);
                    //choix du poste
                       poste = choosePoste.chooseOnePoste();//
                    //choix du game
                    game = chooseGame.displayGameCategory(chooseCategory.categorieNumber());
                    //choix d'heure
                     minutes = chooseHour.getMinutes();
                        Horaire heure = new Horaire(minutes);
                     //reservation
                        price =(double) choosePrice.getPrice(minutes);
                        reservations.add(new Reservation(player,poste,heure,game,price));

                    break;
                case 2 :
                   if(reservations.size() == 0){
                       System.out.println("There is No Players");
                   }else{
                       for(int i=0 ; i<reservations.size() ; i++){
                           System.out.println(" ************************ Player "+(i+1)+" ************************ ");
                           reservations.get(i).showInfos();
                       }
                   }
                    break;
                case 3 :

                    //System.out.println("Revenue : "+Reservation.PRICE+" DH");
                    String word = (Reservation.PRICE == 0.0)?"Revenue":"Revenues";
                    Log.w(word+" :  "+Reservation.PRICE+ " DH");
                    break;
                default:
                    choosePoste.displayPoste();
                    break;
            }

        }while(true);
    }
}