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
public class PC {
    private Case thecase;
    private monitor monitors;
    private MotherBoard motherboard;
    public PC(Case thecase, monitor monitors, MotherBoard motherboard){
        this.thecase = thecase;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }
    public Case getthecase(){return thecase;}
    public void powerup(){
        getthecase().pressPowerButton();
        drawlogo();
    }
    private void drawlogo(){
        monitors.drawPixelArt(1200, 50, "yellow");
    }
    
}
