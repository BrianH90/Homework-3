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
public class animalGPS {
    private String animalLocation;
    
    public animalGPS()
    {
        
    }
    
    public void changeAnimalLocation(String location)
    {
        this.animalLocation = location;
    }
    public String getLocation()
    {
        return this.animalLocation;
    }
}
