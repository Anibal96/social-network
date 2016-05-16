/**
 * Write a description of class Photo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Post
{
    private String username;
    private long timestamp;
    private int likes;
    /**
     * Constructor for objects of class Photo
     */
    public Post(String autor)
    {
        username = autor;
        timestamp = System.currentTimeMillis();
        likes = 0;
    }
    
    /**
     * Metodo para dar un like.
     */
    public void like(){
        likes++;
    }
    
    /**
     * Metodo que devuelve el usuario
     */
    public String getUser(){
        return username;
    }
    
    /**
     * Metodo que devuelve el autor
     */
    public String getAutor(){
        return username;
    }
    
    /**
     * Metodo para quitar un like en caso de que los haya.
     */
    public void unlike(){
        if(likes != 0)
           likes--; 
    }
    
    /**
     * Metodo que devuelve la estampa de tiempo en el momento de crear el post
     */
    public long getTimeStamp(){
        return timestamp;
    }
    
    /**
     * Metodo para pasar el tiempo a minutos y segundos.
     */
    private String timeString(long time){
        String info = "";
        int sec =  (int)(time / 1000) % 60;
        int min =  (int)((time / (1000*60)) % 60);
        if(min > 0)
            info += min + " Minutes, ";
        info += sec + " Seconds\n";
        return info;
    }
    
    /**
     * Metodo que muestra toda la info del post
     */
    public void display(){
        String info = "";
        long time = System.currentTimeMillis() - getTimeStamp();
        info += username + "\n=====================\n" + "Posted: ";
        info += timeString(time);
        info += "_____________________\nLikes: " + likes + "\n=====================\n\n";
        System.out.println(info);
    }
}
