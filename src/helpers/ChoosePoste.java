package helpers;

import gamespace.Poste;

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
     */
    public Poste chooseOnePoste(){
        for(int i=0 ; i<this.postes.size() ; i++ ){
            if(!this.postes.get(i).getPosteAvailable()){
                System.out.println(i+" : "+this.postes.get(i).getNamePoste());
            }

        }
        System.out.println("Enter the number of Available Poste : ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        return this.postes.get(number);
    }
}
