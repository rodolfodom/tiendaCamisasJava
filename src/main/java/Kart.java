import java.util.ArrayList;

public class Kart {
    private ArrayList<Camisa> products;
    private float subtotal;
    private int discountPercentage;
    private float discount;
    private float total;

    public Kart() {
        this.products = new ArrayList<>();
        this.subtotal = 0;
        this.discountPercentage = 0;
        this.discount = 0;
        this.total = 0;
    }

    public int getProductsQuantity(){
        return products.size();
    }

    public boolean addProduct(Camisa product){
        int quantity = this.products.size();
        products.add(product);
        this.subtotal =this.calculateSubtotal();
        this.discountPercentage = this.calculateDiscountPercentage();
        this.discount = this.calculateDiscount();
        this.total = calculateTotal();
        if(this.products.size() == quantity+1) return true;
        return false;
    }

    public float calculateSubtotal(){
        float subtotal = 0;
        for (Camisa product: this.products) {
            subtotal += product.getPrice();
        }
        return subtotal;
    }

    public int calculateDiscountPercentage(){
        int productsQuantity = this.products.size();
        int discountPercentage = 0;
        if(productsQuantity > 5){
            discountPercentage = 8;
        } else if (productsQuantity > 2) {
            discountPercentage = 5;
        }
        return discountPercentage;
    }

    public float calculateDiscount(){
        float netDiscount = this.calculateDiscountPercentage() /100f;
        float discount = this.calculateSubtotal() * netDiscount;
        return discount;
    }

    public float calculateTotal(){
        return this.calculateSubtotal() - this.calculateDiscount();
    }

    @Override
    public String toString() {
        String productsString = "";
        int contador = 1;
        for (Camisa product: this.products) {
            productsString += "\t" + String.valueOf(contador) + ". ID: " + String.valueOf(product.getId())+ ", Descripción: " + product.getDescription() + ", precio: $" + String.valueOf(product.getPrice()) + "\n";
            contador++;
        }
        return "Kart{" + "\n" +
                "PRODUCTOS: \n" + productsString  +
                "Subtotal: " + "$" + subtotal + "\n" +
                "Porcentaje de descuento: " + discountPercentage + "% \n" +
                "Descuento neto: " +  "$" + discount + "\n" +
                "total: " + "$" + total + "\n" +
                '}';
    }
}
