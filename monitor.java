/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersices;

/**
 *
 * @author DELL
 */
public class monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;
    
    public monitor(String model, String manufacturer, int size, Resolution nativeResolution){
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
        
    }
    public void drawPixelArt(int x, int y, String color){
        System.out.println("Drawing pixel art at " + x + y + " in color " + color);
    }
}
