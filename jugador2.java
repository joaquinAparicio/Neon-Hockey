import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jugador2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugador2 extends Actor
{
    /**
     * Act - do whatever the jugador2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 2);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 2, getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 2, getY());
        }//// Add your action code here.// Add your action code here.
    }
}
