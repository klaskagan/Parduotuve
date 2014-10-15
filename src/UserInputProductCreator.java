import java.util.Scanner;

/**
 * Created by Viktoras Baracevicius on 23/09/14.
 */
public class UserInputProductCreator {

    public BendraPreke createGood(){

        int volume, objType;
        double nettoPrice, capacity;
        String name;
        BendraPreke obj;
        Scanner input = new Scanner(System.in);


        do {
            System.out.printf("Type a number of your product type:%n1) Regular product%n2) Medicine%n3) Alcohol%n4) Wine%n");
            objType = input.nextInt();
        } while (objType <= 0 || objType > 4);

//        TODO Suzinoti kaip teisingai panauduoti "nextLine()" metoda, kad useris galetu ivesti stringa is dvieju zodziu
        System.out.println("Enter a name of a product");
        name = input.nextLine();
        name = input.nextLine();

        System.out.println("Enter a netto price in lithuanian litas");
        nettoPrice = input.nextDouble();

        switch (objType){
            case 1:
                obj = new Preke(name, nettoPrice);
                break;
            case 2:
                obj = new Vaistas(name, nettoPrice);
                break;
            case 3:
            case 4:
                System.out.println("Enter a volume level of a drink");
                volume = input.nextInt();
                System.out.println("Enter capacity of a drink");
                capacity = input.nextDouble();
                if (objType == 3) {
                    obj = new Alkoholis(name, nettoPrice, volume, capacity);
                } else {
                    obj = new Vynas(name, nettoPrice, volume, capacity);
                }
                break;
            default:
                return obj = null;
        }
        return obj;
    }
}
