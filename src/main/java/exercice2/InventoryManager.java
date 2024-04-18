package exercice2;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventory;

    public InventoryManager(HashMap<String, Integer> inventory) {
        this.inventory = new HashMap<>();
    }

    public void addProduct(String productId, int quantity) {
        inventory.put(productId, quantity);
    }

    public void removeProduct(String productId, int quantityToRemove) {
        if (!inventory.containsKey(productId)) {
            throw new IllegalArgumentException("Le produit n'est pas présent dans l'inventaire.");
        }

        int currentQuantity = inventory.get(productId);
        if (quantityToRemove > currentQuantity) {
            throw new IllegalArgumentException("La quantité à retirer est supérieure à celle disponible dans l'inventaire.");
        }

        inventory.put(productId, currentQuantity - quantityToRemove);
    }

    public int getStockAvailability(String productId) {
        return inventory.getOrDefault(productId, 0);
    }
}
