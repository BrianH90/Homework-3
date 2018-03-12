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
public class ZooInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int customerID;
        String fName;
        String lName;
        int age;
        double amountPaid;
        String comments;
        int animalID;
        String animalName;
        String animalLocation;
        String animalFood;
        int nextFeed;
        String assignedEmployee;
        String animalPopularity;
        String animalComment;
        int itemID;
        int quantity;
        double price;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nWhat is the customer's ID number?\n");
        customerID = scanner.nextInt();
        fName = scanner.nextLine();
        System.out.printf("\nWhat is the customer's first name?\n");
        fName = scanner.nextLine();
        System.out.printf("\nWhat is the customer's last name?\n");
        lName = scanner.nextLine();
        System.out.printf("\nWhat is the customer's age?\n");
        age = scanner.nextInt();
        System.out.printf("\nWhat has the customer paid the zoo to date?\n");
        amountPaid = scanner.nextDouble();
        System.out.printf("\nAny notes or commments about the customer?\n");
        comments = scanner.nextLine();
        System.out.printf("\naddCustomer test\n");
        customerProcessing newCustomer = new customerProcessing(customerID, 
                fName, lName, age, amountPaid, comments);
        System.out.printf("ticketBuy test(Cost based on age of purchaser)\n");
        System.out.printf("Input 1 ticket\n");
        price = newCustomer.buyTicket(1);
        System.out.printf("Ticket cost was: $ %s\n", price);
        System.out.printf("Customer has paid: $ %s\n", newCustomer.getamountPaid());
        
        System.out.printf("inventoryTable test\nAdd item to inventory table\n"
                + "What is the itemID?\n");
        itemID = scanner.nextInt();
        System.out.printf("How much of the item is in stock?");
        quantity = scanner.nextInt();
        System.out.printf("How much does the item cost?");
        price = scanner.nextDouble();
        inventoryTable itemInput = new inventoryTable(itemID, quantity, price);
        

        System.out.printf("giftBuy test\n");
        System.out.printf("How many items do you wish to purchase?\n");
        quantity = scanner.nextInt();
        System.out.printf("... Purchasing item...\n");
        double paid = itemInput.giftBuy(itemID, quantity);
        System.out.printf("The customer has paid $ %s.\n", paid);
        newCustomer.addamountPaid(paid);
        System.out.printf("Customer has paid: $ %s total\n", newCustomer.getamountPaid());
        System.out.printf("%s items remain.\n", itemInput.getQuantity());
        System.out.printf("buyInventory test\n");
        
        System.out.printf("inventoryTable test\nAdd item to inventory table\n"
                + "What is the itemID?\n");
        itemID = scanner.nextInt();
        System.out.printf("How much of the item is in stock?");
        quantity = scanner.nextInt();
        System.out.printf("How much does the item cost?");
        price = scanner.nextDouble();
        inventoryTable inventoryItem = new inventoryTable(itemID, quantity, price);
        
        System.out.printf("How much more inventory of this item do you need?\n");
        quantity = scanner.nextInt();
        double cost = inventoryItem.addStock(quantity);
        
        System.out.printf("There are now %s of the item in stock.\nThis cost $%s.", inventoryItem.getQuantity(), paid);
        
        
        
        System.out.printf("\naddAnimal test\n");
        System.out.printf("What is the Animal's ID?\n");
        
        animalID = scanner.nextInt();
        animalName = scanner.nextLine();
        System.out.printf("What is the Animal's name?\n");
        animalName = scanner.nextLine();
        System.out.printf("What is the Animal's location?\n");
        animalLocation = scanner.nextLine();
        System.out.printf("What does the Animal Eat?\n");
        animalFood = scanner.nextLine();
        System.out.printf("What is the Animal's next feeding time, in hours?\n");
        nextFeed = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Who is assigned to tend to the animal?\n");
        assignedEmployee = scanner.nextLine();
        System.out.printf("How popular is the animal?\n");
        animalPopularity = scanner.nextLine();
        System.out.printf("Any comments about the animal?\n");
        animalComment = scanner.nextLine();
        animalTable animal = new animalTable(animalID, animalName, animalLocation, animalFood, nextFeed, 
        assignedEmployee, animalPopularity, animalComment);
        
        
        System.out.printf("updateAnimal test\n");
        System.out.printf("The Animal's ID is currently: %s, what would you like to change it to?\n", animal.getanimalID());
        animalID = scanner.nextInt();
        animal.setanimalID(animalID);
        scanner.nextLine();
        
        System.out.printf("The animal's name is currently: %s\n What would you like to change it to?\n", animal.getanimalName());
        animalName = scanner.nextLine();
        animal.setanimalName(animalName);
        
        System.out.printf("The animal's location is currently: %s\n"
                + "What would you like to change it to?\n", animal.getLocation());
        animalLocation = scanner.nextLine();
        animal.setLocation(animalLocation);
        System.out.printf("The animal's food is currently: %s\n"
                + "What would you like to change it to?\n", animal.getanimalFood());
        animalFood = scanner.nextLine();
        animal.setanimalFood(animalFood);
        System.out.printf("The animal's next feeding time is currently: %s hours away\n"
                + "What would you like to change it to?\n", animal.getnextFeed());
        nextFeed = scanner.nextInt();
        animal.setnextFeed(nextFeed);
        scanner.nextLine();
        System.out.printf("The animal's handler is currently: %s\n"
                + "Who would you like to change it to?\n", animal.getassignedEmployee());
        assignedEmployee = scanner.nextLine();
        animal.setassignedEmployee(assignedEmployee);
        System.out.printf("The animal's popularity is currently: %s\n"
                + "What would you like to change it to?\n", animal.getanimalPopularity());
        animalPopularity = scanner.nextLine();
        animal.setanimalPopularity(animalPopularity);
        System.out.printf("The comment on this animal is currently: %s\n"
                + "What would you like to change it to?\n", animal.getanimalComment());
        animalComment = scanner.nextLine();
        animal.setanimalComment(animalComment);
        System.out.printf("updateCustomer test\n");
        System.out.printf("The customer's ID is currently: %s \n"
                + "What would you like to change it to?\n", newCustomer.getID());
        customerID = scanner.nextInt();
        newCustomer.setID(customerID);
        scanner.nextLine();
        System.out.printf("The customer's first name is currently: %s \n"
                + "What would you like to change it to?\n", newCustomer.getfName());
        fName = scanner.nextLine();
        newCustomer.setfName(fName);
        System.out.printf("The customer's Last Name is currently: %s \n"
                + "What would you like to change it to?\n", newCustomer.getlName());
        lName = scanner.nextLine();
        newCustomer.setlName(lName);
        System.out.printf("The customer's Last Name is currently: %s \n"
                + "What would you like to change it to?\n", newCustomer.getage());
        age = scanner.nextInt();
        newCustomer.setage(age);
        scanner.nextLine();
        System.out.printf("The comment's on this customer's profile is currently: %s \n"
                + "What would you like to change it to?\n", newCustomer.getlName());
        comments = scanner.nextLine();
        newCustomer.setComment(comments);
        System.out.printf("\nTest Complete.");
    }
    
}
