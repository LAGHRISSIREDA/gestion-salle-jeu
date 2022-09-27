package helpers;

import gamespace.Poste;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ChoosePoste {
    ArrayList<Poste> postes = new ArrayList<>();



    public ChoosePoste(){
        this.postes.add(new Poste(1,"Xbox......  =======>  DELL....."));
        this.postes.add(new Poste(2,"Xbox......  =======>  DELL....."));
        this.postes.add(new Poste(3,"Xbox......  =======>  DELL....."));
        this.postes.add(new Poste(4,"Xbox......  =======>  HP......."));
        this.postes.add(new Poste(5,"PS5.......  =======>  SAMSUNG.."));
        this.postes.add(new Poste(6,"PS5.......  =======>  SAMSUNG.."));
        this.postes.add(new Poste(7,"PS5.......  =======>  ASUS....."));
        this.postes.add(new Poste(8,"NINTENDO..  =======>  ASUS....."));
        this.postes.add(new Poste(9,"NINTENDO..  =======>  ASUS....."));
    }

    /*
    choose from available poste
    and display postes
     */

    public void displayPoste(){
        for(int i=0 ; i<this.postes.size() ; i++ ){
            if(this.postes.get(i).getPosteAvailable()){
                Log.i(i+" : "+this.postes.get(i).getNamePoste());
                //System.out.println(i+" : "+this.postes.get(i).getNamePoste());
            }else{
                Log.e(i+" : This Poste Not Available until => "+this.postes.get(i).getDateEnd());
                // System.out.println(i+" : This Poste Not Available until => "+this.postes.get(i).getDateEnd());
            }

        }
    }

    public Poste chooseOnePoste(){

        System.out.println(" ************************ Postes-Available ************************ ");
         displayPoste();
        System.out.println("Enter the number of Available Poste : ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        this.postes.get(number).setPosteAvailable();
        return this.postes.get(number);
    }


    //setDateend



}
