import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jugador1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugador1 extends Actor
{
    /**
     * Act - do whatever the jugador1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("W"))
        {
            setLocation(getX(), getY() - 2);
        }
        if(Greenfoot.isKeyDown("S"))
        {
            setLocation(getX(), getY() + 2);
        }
        if(Greenfoot.isKeyDown("A"))
        {
            setLocation(getX() - 2, getY());
        }
        if(Greenfoot.isKeyDown("D"))
        {
            setLocation(getX() + 2, getY());
        }//// Add your action code here.
    }
}
