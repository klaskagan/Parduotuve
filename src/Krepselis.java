import java.util.ArrayList;

/**
 * Created by Viktoras Baracevicius on 25/09/14.
 */
public class Krepselis {

    ArrayList<IItem> cartGoods;


    public Krepselis(ArrayList<IItem> prekes){
        cartGoods = new ArrayList<IItem>(prekes);
    }

    public ArrayList<String> getGoodsName() {
        ArrayList<String> goodsNames = new ArrayList<String>();

        for (IItem preke : cartGoods){
            goodsNames.add(preke.getName());
            //  vietoj ArrayListo galima grazinti Stringa. main metode reiketu tesiog atspausdinti atformatuota stringa
            //vardai += String.format("Vardas: %s%n", preke.getName());
        }
        return goodsNames;
    }
    

    //atspausdinkVisuPrekiuSuma()
    public double calculateTotalPriceInLitas(){
        double totalPrice = 0;
        for (IItem preke : cartGoods){
            totalPrice += preke.calculatePriceInLitas();
        }
        return totalPrice;
    }

    public double calculateTotalPriceInEuros(){
        return calculateTotalPriceInLitas() / 3.45;
    }


//    // method for showing total price with discount for GOLD, SILVER, BRONZE accounts
    public double calculateTotalPriceWithDiscountInLitas(ClientType type){
        return calculateTotalPriceInLitas() - (calculateTotalPriceInLitas() * type.getDiscount());
    }

    public double calculateTotalPriceWithDiscountInEuros(ClientType type){
        return calculateTotalPriceWithDiscountInLitas(type) / 3.45;
    }

    public double getDiscountTotal(ClientType type){
        return calculateTotalPriceInLitas() * type.getDiscount();
    }

}
