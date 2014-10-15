/**
 * Created by Viktoras Baracevicius on 23/09/14.
 */
public class Vynas extends BendraPreke {

    public Vynas(String name, double nettoPrice, int volume, double capacity) {
        super(name, nettoPrice);
        this.volume = volume;
        this.capacity = capacity;
        this.exciseTax = volume < 8.5 ? 0.85 : 2.25;
    }

    public double calculatePriceInLitas(){
        if ( volume < 8.5) {
            return priceInLitas = (this.nettoPrice * TAX) + (capacity * exciseTax) + this.nettoPrice;
        } else {
            return priceInLitas = (this.nettoPrice * TAX) + (capacity * exciseTax) + this.nettoPrice;
        }
    }
}
