/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersices;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {
    public static void main(String[]args){
        
        Case thecase = new Case("2245", "DELL", "246", new Dimensions(20 , 20 , 5));
        monitor monitors = new monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440));
        MotherBoard motherboard = new MotherBoard("B3-260", "ASUS", 4, 4 , "V2,44");
        PC thepc = new PC(thecase, monitors, motherboard);
        thepc.powerup();
    }
       // Complete the solve function below.
  

    }

 
    

