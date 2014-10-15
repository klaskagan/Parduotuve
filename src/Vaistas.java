/**
 * Created by Viktoras Baracevicius on 23/09/14.
 */
public class Vaistas extends BendraPreke {

    protected final double TAX = 0.09;

    public Vaistas(String name, double nettoPrice) {
        super(name, nettoPrice);
    }

    public double calculatePriceInLitas(){
        return priceInLitas = nettoPrice +(this.nettoPrice * TAX);
    }

}
