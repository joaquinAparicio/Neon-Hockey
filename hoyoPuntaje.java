import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hoyoPuntaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hoyoPuntaje extends Actor
{
    public disco pointer;
    private int punto = 0;
    /**
     * Act - do whatever the hoyoPuntaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       score();
    }
    public void score()
    {
        disco pointer = (disco) getOneIntersectingObject(disco.class);
        if (pointer != null)
        {
            punto = 1;
            getWorld().removeObject(pointer);
        }
    }
    public int getPunto()
    {
        return punto;
    }
}
