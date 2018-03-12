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
public class animalTable {
    private animalGPS location = new animalGPS();
    private int animalID;
    private String animalName;
    private String animalFood;
    private int nextFeed;
    private String assignedEmployee;
    private String animalPopularity;
    private String animalComment;
    public animalTable(int animalID, String animalName, String animalLocation, String animalFood, int nextFeed, 
        String assignedEmployee, String animalPopularity, String animalcomment)
    {
        this.animalID = animalID;
        this.animalComment = animalComment;
        this.animalFood = animalFood;
        this.animalName = animalName;
        this.animalPopularity = animalPopularity;
        this.nextFeed = nextFeed;
        this.assignedEmployee = assignedEmployee;
        this.location.changeAnimalLocation(animalLocation);
    }
    
    public int getanimalID()
    {
        return this.animalID;
    }
    
    public void setanimalID(int ID)
    {
        this.animalID = ID;
    }
    
    public int getnextFeed()
    {
        return this.nextFeed;
    }
    
    public void setnextFeed(int feed)
    {
        this.nextFeed = feed;
    }
    
    public String getanimalName()
    {
        return this.animalName;
    }
    public void setanimalName(String name)
    {
        this.animalName = name;
    }
    public String getanimalComment()
    {
        return this.animalComment;
    }
    public void setanimalComment(String comment)
    {
        this.animalComment = comment;
    }
    public String getassignedEmployee()
    {
        return this.assignedEmployee;
    }
    public void setassignedEmployee(String emp)
    {
        this.assignedEmployee = emp;
    }
    public String getLocation()
    {
        return this.location.getLocation();
    }
    public void setLocation(String location)
    {
        this.location.changeAnimalLocation(location);
    }
    public String getanimalFood()
    {
        return this.animalFood;
    }
    public void setanimalFood(String food)
    {
        this.animalFood = food;
    }
    public String getanimalPopularity()
    {
        return this.animalPopularity;
    }
    public void setanimalPopularity(String pop)
    {
        this.animalPopularity = pop;
    }
    
}
