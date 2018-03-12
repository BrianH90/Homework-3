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
public class customerProcessing {
        private int customerID;
        private String fName;
        private String lName;
        private int age;
        private double amountPaid;
        private String comments;
    public customerProcessing(int customerID, String fName, String lName, int age, 
            double amountPaid, String comments)
    {
        this.customerID = customerID;
        this.age = age;
        this.amountPaid = amountPaid;
        this.fName = fName;
        this.lName = lName;
        this.comments = comments;
    }
    public int getID()
    {
        return this.customerID;
    }
    public void setID(int id)
    {
        this.customerID = id;
    }
    public String getfName()
    {
        return this.fName;
    }
    public void setfName(String name)
    {
        name = this.fName;
    }
    public String getlName()
    {
        return this.lName;
    }
    public void setlName(String name)
    {
        name = this.lName;
    }
    public int getage()
    {
        return this.age;
    }
    public void setage(int age)
    {
        this.age = age;
    }
    public String getComment()
    {
        return this.comments;
    }
    public void setComment(String comment)
    {
        this.comments = comment;
    }
    public double getamountPaid()
    {
        return this.amountPaid;
    }
    public void addamountPaid(double purchase)
    {
        this.amountPaid += purchase;
    }
    
    public double buyTicket(int ticketnum)
    {
        double adultTicketCost = 10.50;
        double childTicketCost = 8.25;
        double seniorTicketCost = 9.50;
        double totalcost = 0;
        if (age >= 13 && age < 65)
            totalcost = ticketnum * adultTicketCost;
        else if (age < 13)
            totalcost = ticketnum * childTicketCost;
        else if (age >= 65)
            totalcost = ticketnum * seniorTicketCost;
        this.amountPaid += totalcost;
        return totalcost;
    }
    
}
