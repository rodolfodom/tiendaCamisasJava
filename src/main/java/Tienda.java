public class Tienda {
    static Kart myKart= new Kart();
    public static void main(String[] args) {
        myKart.addProduct(Camisa.CAMISA1);
        myKart.addProduct(Camisa.CAMISA1);
        myKart.addProduct(Camisa.CAMISA1);
        myKart.addProduct(Camisa.CAMISA2);
        myKart.addProduct(Camisa.CAMISA3);
        myKart.addProduct(Camisa.CAMISA1);
        myKart.addProduct(Camisa.CAMISA2);

        System.out.println(myKart);
    }
}
