import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
     eat(); 
     dance();
     sleep(7);
     walkLeft(3);
     walkRight(3);
     shoutHooray();
     dance();
     if (isSleepy())
     {
         sleep(3);
     }
     if (isBored())
     {
         dance();
     }
     if (isHungry())
     {
         eat();
     }
     if (isSleepy())
     {
         sleep(5);
         shoutHooray();
    
     } 
     else
     {
         shoutHooray();
    
     }
     if (isAlone())
     {
         sleep(9);
        
     }
     else
     {
         shoutHooray();
     }
    }
}
