import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Terreno son todos los segmentos de terreno que tendra el actor Flint para poder desplazarse y salar sobre ellos
 * 
 * @author (Yesenia Saenz, Evelin Miranda, Laura Hernandez) 
 // * @version (1.15042021)
 */
public class Terreno extends Actor
{
    int a  = -4;
    /**
     * Act - do whatever the Terreno wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
                setLocation(getX()+a, getY());

    }    
}
