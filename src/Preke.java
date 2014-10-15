/**
 * Created by Viktoras Baracevicius on 23/09/14.
 */
public class Preke extends BendraPreke {


    public Preke(String name, double nettoPrice) {
        super(name, nettoPrice);
    }

    @Override
    public double calculatePriceInLitas() {
        return priceInLitas = nettoPrice +(this.nettoPrice * TAX);
    }
}
