/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinformationsystem;
import java.util.Scanner;

/**
 *
 * @author Brianh
 */
public class inventoryTable {
    private int itemID;
    private int quantity;
    private double price;
    public inventoryTable(int itemID, int quantity, double price)
    {
        itemID = this.itemID;
        quantity = this.quantity;
        price = this.price;
    }
    
    public int getQuantity() {
    return this.quantity;
    }
    
    public double giftBuy(int itemID, int quantity)
    {
        double totalCost;
        if (this.quantity < quantity)
        {
            System.out.printf("\nThere are not enough of this item remaining for this purchase order."
                    + " Order canceled.");
            return 0;
                    }
        else
        {
            totalCost = this.price * quantity;
            this.quantity -= quantity;
            return totalCost;
                    }
    }
    
    public double addStock(int quantity)
    {
        this.quantity += quantity;
        return (quantity * this.price);
    }
    
}
