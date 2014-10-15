/**
// * Created by Viktoras Baracevicius on 23/09/14.
// */
public class Alkoholis extends BendraPreke {
    protected final double TAX = 0.21;


    public Alkoholis(String name, double nettoPrice, int volume, double capacity) {
        super(name, nettoPrice);
        this.exciseTax = volume < 15 ? 2.81 : 4;
        this.volume = volume;
        this.capacity = capacity;
    }

    public double calculatePriceInLitas(){
        if ( volume < 15) {
            return priceInLitas = (this.nettoPrice * TAX) + (capacity * exciseTax) + this.nettoPrice;
        } else {
            return priceInLitas = (this.nettoPrice * TAX) + (capacity * exciseTax) + this.nettoPrice;
        }
    }
}
