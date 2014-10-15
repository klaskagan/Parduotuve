import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Viktoras Baracevicius on 23/09/14.
 */
public class Parduotuve {
    public static void main(String[] args) {

        int clientTypeInt;
        boolean continueShopping;
        UserInputProductCreator preke = new UserInputProductCreator();
        ArrayList<IItem> prekes = new ArrayList<IItem>();
        Scanner input = new Scanner(System.in);

        do {
            prekes.add(preke.createGood());
            System.out.printf("Checkout?%nType 1 to checkout%nType 2 to continue shopping%n");
            continueShopping = input.nextInt() == 2;
        } while (continueShopping);


        do {
            System.out.printf("Type a number of your discount type:%n1) Gold%n2) Silver%n3) Bronze%n4) No discount%n");
            clientTypeInt = input.nextInt();
        } while (clientTypeInt <= 0 || clientTypeInt > 4);

        Krepselis krepselis = new Krepselis(prekes);
        System.out.println("*********************************");
        System.out.println("Products in your cart are:");
        for (String goodsName : krepselis.getGoodsName()) {
            System.out.printf("%s%n", goodsName);
        }
        System.out.printf("You have saved: LT %.2f%n", krepselis.getDiscountTotal(ClientType.getClientType(clientTypeInt)));
        System.out.printf("Total price with discount: LT %.2f / €%.2f%n",
                krepselis.calculateTotalPriceWithDiscountInLitas(ClientType.getClientType(clientTypeInt)),
                krepselis.calculateTotalPriceWithDiscountInEuros(ClientType.getClientType(clientTypeInt))
        );
        System.out.println("*********************************");

    }
}
