import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StoreTest{


    //Single_line_acton_section
    @Test
    public void Purchase_succeeds_when_enough_inventory() {

        var store = new Store();

        store.addInventory(Product.Shampoo, 10);
        var customer = new Customer();

        boolean success = customer.purchase(store,Product.Shampoo,5);

        Assert.assertTrue(success);
        Assert.assertEquals(5,store.getInventory(Product.Shampoo));

    }

    @Test
    public void Purchase_succeeds_when_enough_inventoryOne() {

        var store = new Store();

        store.addInventory(Product.Shampoo, 10);
        var customer = new Customer();

        boolean success = customer.purchaseOne(store,Product.Shampoo,5);
        store.removeInventory(success,Product.Shampoo, 5);

        Assert.assertTrue(success);
        Assert.assertEquals(5,store.getInventory(Product.Shampoo));

    }
}
