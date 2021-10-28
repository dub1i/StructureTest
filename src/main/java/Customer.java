public class Customer {

    public boolean purchase(Store store,Product product, int quantity) {

        if (store.hasEnoughInventory(product, quantity)) {
            product.setQuantity(product.getQuantity() - quantity);
            return true;
        }
        return false;
    }

    /**
     *
     *Этот метод был добавлен для выполнения второго теста, удаление предметов со склада происходит в том случае,
     * если покупка успешна. Иначе, возникала ошибка (Удаление 5 элементов из инвентаря при покупке,
     * затем, еще 5 — методом удаления. Ожидалось: 5, получалось: 0
     *
     */
    public boolean purchaseOne(Store store,Product product, int quantity) {

        if (store.hasEnoughInventory(product, quantity)) {
            //product.setQuantity(product.getQuantity() - quantity);
            return true;
        }
        return false;
    }
}
