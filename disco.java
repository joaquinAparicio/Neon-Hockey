import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class disco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class disco extends Actor
{
    /**
     * Act - do whatever the disco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dx = 3;
    int dy = 0;
    public jugador1 player1;
    public jugador2 player2;
    public mapa miMundo;
    public hoyoPuntaje porteria1;
    public hoyoPuntaje porteria2;
    public int score;
    public disco(jugador1 player1, jugador2 player2, mapa mundo)
    {
        miMundo = mundo;
        this.player1 = player1;
        this.player2 = player2;
    }
    public void act()
    {
        moveAround();
        bounce();
        rebotaRebota();
    }
    public void moveAround()
    {
        setLocation(getX() + dx, getY() + dy);
    }
    public void bounce()
    {
        if(isTouching(jugador2.class) && this.player2.getY() > getY() + 5)
        {
            dx = -dx;
            dy-= 1;
        }
        else if(isTouching(jugador2.class) && this.player2.getY() < getY() - 5)
        {
            dx = -dx;
            dy+= 1;
        }
        else if(isTouching(jugador2.class))
        {
            dx = -dx;
        }
        if(isTouching(jugador1.class) && this.player1.getY() > getY() + 5)
        {
            dx = -dx;
            dy-= 1;
        }
        else if(isTouching(jugador1.class) && this.player1.getY() < getY() - 5)
        {
            dx = -dx;
            dy+= 1;
        }
        else if(isTouching(jugador1.class))
        {
            dx = -dx;
        }
    }
    public void rebotaRebota()
    {
        if(getY() == 129)
        {
            dx = dx;
            dy = -dy;
        }
        if(getY() == 336)
        {
            dx = dx;
            dy = -dy;
        }
        if (getX() == 88)
        {
            dx -= -dx;
        }
        if (getX() == 550)
        {
            dx -= -dx;
        }
    }
}
