package helpers;

public class ChoosePrice {
   public double getPrice(int i){
        double price;
        switch (i){
            case 30  : price  = 5 ; break;
            case 60  : price  = 10; break;
            case 120  : price = 18; break;
            case 300  : price = 40; break;
            default : price   = 65; break;
        }
        return price;
    }
}
