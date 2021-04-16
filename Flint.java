import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Flint es el personaje principal, en esta clase se definen sus movimientos e interacciones con demas obstaculos.
 * 
 * @author (Yesenia Saenz, Evelin Miranda, Laura Hernandez) 
 // * @version (1.15042021)
 */
public class Flint extends Actor

{
       private int velhor = 4;
       private int velver = 0;
       private int acel = 1;
       private int fuerzasalto = 19;
    /**
     * Act - do whatever the Flint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      mirarpasos();
      comprobarcaida();
      touchbarra();
    }   
    /**
     * MirarPasos basicamente define los movimientos que realizara el actor Flint si el usuario presiona las teclas definidas en el mismo.
     */
    private void mirarpasos(){
        if(Greenfoot.isKeyDown("left")){
            setImage("flintizq.png");
            moverizq();
        }   
        if(Greenfoot.isKeyDown("right")){
            setImage("flint.png");
            moverder();
        }
        if(enpiso() && (Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("up"))){
            salto();
        }
        
    }
    /**
     * Touchbarra es el metodo que me informa si Flint se toca con el objeto de clase barra, para detenerse en el centro y no avanzar, para que los objetos sean los que avancen.
     */
        public void touchbarra(){
       if( isTouching(Barra.class)){
        velhor = 0;
        }
}
    /**
     * comprobar caida, comprueba si el metodo enpiso es verdadero Flint se queda en el piso, si no entra al metodo caida.
     */
    
    public void comprobarcaida(){
     if(enpiso())   
         velver = 0;
        else
           caida();
        
    }
    /**
     * enpiso usa getOneObjectAtOffset que Devuelve un objeto que se encuentra en la celda especificada(en relación con la ubicación de este objeto),
     * informandome si dos objetos en relacion a la clase dada se estan tocando con flint en las coordenadas dadas.  
     */
    public boolean enpiso(){
        Actor debajo =  getOneObjectAtOffset(0, 97/2, Piso.class);
        Actor debajosup =  getOneObjectAtOffset(0, 97/2, Terreno.class);
           if (debajo != null){
               return debajo != null;
            } else if(debajosup != null){
               return debajosup != null;
            }

        return debajosup != null;
    }
    /**
     * Caida es el metodo que si Flint no se encuentra en el piso ira en bajada hasta que encuentre el piso o se encuentre con el borde del mismo
     */
    public void caida(){
        setLocation(getX(), getY() + velver);
        velver = velver + acel;
    }
    public void moverizq(){
        setLocation(getX() - velhor, getY());
    }
    public void moverder(){
        setLocation(getX() + velhor, getY());
    }
    public void salto(){
        velver = -fuerzasalto;
        caida();
    }
    
    
}

