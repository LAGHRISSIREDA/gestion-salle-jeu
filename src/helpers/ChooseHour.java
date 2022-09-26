package helpers;

import gamespace.Horaire;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ChooseHour {

    public ChooseHour(){

    }

    public int getMinutes(){
        int minutes,number;
        System.out.println(" ************************ Choose Time : ************************ ");
        System.out.println("0 ) 2 Minutes ..................");
        System.out.println("1 ) 1 Hour     ..................");
        System.out.println("2 ) 2 Hours    ..................");
        System.out.println("3 ) 5 Hours    ..................");
        System.out.println("4 ) Lux        ..................");
        do{
            Scanner sc = new Scanner(System.in);
            number = Integer.parseInt(sc.nextLine());
        }while(number != 0  &&  number !=1 && number != 2 && number != 3 && number != 4 );

        switch(number){
            case 0  : minutes = 2; break;
            case 1  : minutes = 60; break;
            case 2  : minutes = 120; break;
            case 3  : minutes = 300; break;
            default : minutes = 720; break;
        }

        return minutes;
    }

}
