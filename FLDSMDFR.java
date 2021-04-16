import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * El mundo FLDSMDFR es el mundo inicial  o el primer nivel donde se encuentran todos los actores.
 * 
 * @author (Yesenia Saenz, Evelin Miranda, Laura Hernandez) 
 // * @version (1.15042021)
 */
public class FLDSMDFR extends World {
    
    int cont =0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public FLDSMDFR()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(801 , 600, 1); 
        
        // Create a Flint Object
        
        Flint flintper1 = new Flint(); 
        
        //Create a Piso Object 
        
        Piso piso = new Piso();
        
        //Add piso to our world
        
        addObject(piso, 400, 550);
        
        //Add flint to our world
  
        addObject(flintper1, 50, 434);

        //Create a Barra Object
        
        Barra barra = new Barra();
        
        addObject(barra, getWidth()/2, getHeight());
    }
    
    public void act(){
                    cont++;
            if (cont==200){
             Terreno pisosup = new Terreno();
             
             GreenfootImage image = pisosup.getImage();

             
             addObject(pisosup, getWidth()-30, 350 + image.getHeight());
             cont =0;
            }
        
       

    
    }
}
