import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mapa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mapa extends World
{
    /**
     * Constructor for objects of class mapa.
     * 
     */
    public jugador1 player1 = new jugador1();
    public jugador2 player2 = new jugador2();
    public disco pointer = new disco(player1, player2, this);
    public hoyoPuntaje porteriaJugador1 = new hoyoPuntaje();
    public hoyoPuntaje porteriaJugador2 = new hoyoPuntaje();
    public winner texto = new winner();
    public mapa miMundo;
    GifImage myGif = new GifImage("mapa cancha.gif");
    public void gifAnimation()
    {
        setBackground(myGif.getCurrentImage());
    }
    public void act()
    {
        gifAnimation();
        appear();
    }
    public mapa()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 360, 1);
        prepare();
    }
    public void prepare()
    {
        addObject(player1,140, 225);
        addObject(player2, 500, 225);
        addObject(pointer, 170, 225);
        addObject(porteriaJugador1, 96, 227);
        addObject(porteriaJugador2, 543, 227);
    }
        public void appear()
    {
        hoyoPuntaje hoyo = getObjects(hoyoPuntaje.class).get(0);
        if (hoyo.getPunto() == 1)
        {
            addObject(texto,320, 225); 
        }
        if (porteriaJugador2.getPunto() == 1)
        {
            addObject(texto,320, 225); 
        }
    }
}
