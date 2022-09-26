package helpers;

import java.util.Scanner;

public class ChooseCategorie {
    public boolean categorieNumber;

    public Integer categorieNumber(){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println(" ************************ Choose Category : ************************ ");
        System.out.println("Tape 1 : Football");
        System.out.println("Tape 2 : Guerre");
        do {
            number = Integer.parseInt(sc.nextLine());
        }while(number != 1 && number!=2);
        return number;
    }
}
