public class Store  {

    private int quantity;

    public Store() {
    }


    public void addInventory(Product product, int quantity) {
        product.setQuantity(quantity);

    }

    public void removeInventory(boolean success, Product product, int quantity) {
        if (success) {
            this.quantity = product.getQuantity() - quantity;
            product.setQuantity(this.quantity) ;
        }

    }

    public int getInventory(Product product) {
        return product.getQuantity();
    }

    public boolean hasEnoughInventory(Product product, int quantity) {
        return product.getQuantity() >= quantity;

    }

}
