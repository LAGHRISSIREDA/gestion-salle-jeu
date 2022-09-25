import gamespace.*;
import helpers.ChooseCategorie;
import helpers.ChooseGame;
import helpers.ChooseHour;
import helpers.ChoosePoste;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ChooseCategorie chooseCategory = new ChooseCategorie();
        ChoosePoste poste = new ChoosePoste();

        String firstName,lastName;
        double price;
        ChooseHour chooseHour = new ChooseHour();
        ChooseGame chooseGame = new ChooseGame();
        do{
            //choose category
            int categoryNumber = chooseCategory.categorieNumber() ;
            //fill player infos
            Scanner sc = new Scanner(System.in);
            System.out.println("Your firstname : ");
            firstName = sc.nextLine();

            System.out.println("Your lastName : ");
            lastName = sc.nextLine();

            Player player = new Player(firstName,lastName);
            //choose Game
            System.out.println("enter price");
            price = Double.parseDouble(sc.nextLine());
            int minutes = chooseHour.getMinutes();
            Horaire hours = new Horaire(minutes);
            Game game = new Game(chooseGame.displayGameCategory(categoryNumber).getNameOfGame());
            System.out.println(game.getNameOfGame());

            //reservation
            Reservation reservation = new Reservation(player,poste.chooseOnePoste(),hours,game,price);
            reservation.showInfos();




        }while(true);
    }
}