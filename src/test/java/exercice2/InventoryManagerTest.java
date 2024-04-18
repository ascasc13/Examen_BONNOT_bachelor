package exercice2;

import exercice2.InventoryManager;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class InventoryManagerTest {

    @Test
    public void testSufficientStockAvailability() {
        // Création d'un inventaire avec un produit et une quantité suffisante
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("product1", 100);

        // Création d'un gestionnaire d'inventaire avec cet inventaire
        InventoryManager manager = new InventoryManager(inventory);

        // Vérification que la quantité de stock disponible est correcte pour le produit
        assertEquals(100, manager.getStockAvailability("product1"));
    }

    @Test
    public void testInsufficientStockAvailability() {
        // Création d'un inventaire avec un produit et une quantité insuffisante
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("product2", 5);

        // Création d'un gestionnaire d'inventaire avec cet inventaire
        InventoryManager manager = new InventoryManager(inventory);

        // Vérification que la quantité de stock disponible est correcte pour le produit
        assertEquals(5, manager.getStockAvailability("product2"));
    }

    @Test
    public void testEmptyStockAvailability() {
        // Création d'un inventaire avec un produit et une quantité épuisée
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("product3", 0);

        // Création d'un gestionnaire d'inventaire avec cet inventaire
        InventoryManager manager = new InventoryManager(inventory);

        // Vérification que la quantité de stock disponible est correcte pour le produit
        assertEquals(0, manager.getStockAvailability("product3"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonExistentProduct() {
        // Création d'un inventaire vide
        HashMap<String, Integer> inventory = new HashMap<>();

        // Création d'un gestionnaire d'inventaire avec cet inventaire
        InventoryManager manager = new InventoryManager(inventory);

        // Tentative d'accéder à un produit qui n'existe pas dans l'inventaire
        manager.getStockAvailability("nonExistentProduct");
    }
}
