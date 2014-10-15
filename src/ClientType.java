/**
 * Created by Viktoras Baracevicius on 29/09/14.
 */
public enum ClientType {
    GOLD(0.20),
    SILVER(0.10),
    BRONZE(0.05),
    REGULAR(0);

    private double discount;

     ClientType(double i) {
         this.discount = i;
    }

    public double getDiscount(){
        return discount;
    }

    public static ClientType getClientType(int clientTypeInt){

        ClientType clientType;


        switch (clientTypeInt){
            case 1:
                clientType = GOLD;
                break;
            case 2:
                clientType = SILVER;
                break;
            case 3:
                clientType = BRONZE;
                break;
            case 4:
                clientType = REGULAR;
                break;
            default:
                clientType = null;
        }
        return clientType;
    }
}
