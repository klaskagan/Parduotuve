/**
 * Created by Viktoras Baracevicius on 26/09/14.
 */
public abstract class BendraPreke implements IItem {
    protected final double TAX = 0.21;
    protected String name;
    protected double nettoPrice;
    protected double priceInLitas;
    protected int volume;
    protected double capacity;
    protected double exciseTax;


    public BendraPreke(String name, double price){
        this.name = name;
        this.nettoPrice = price;
    }

    public String getName(){
        return this.name;
    }

//    public abstract double calculatePriceInLitas();

    public double calculatePriceInEuros(){
        return calculatePriceInLitas() / 3.45;
    }

}
