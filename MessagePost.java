import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;
    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        username = author;
        message = text;
        comments = new ArrayList<String>();
        timestamp = System.currentTimeMillis();
    }
    
    /**
     * Metodo que permite darle a like.
     */
    public void like()
    {
        likes++;
    }
    
    /**
     * Metodo que quita un like
     */
    public void unlike()
    {
        likes--;
    }
    
    /**
     * Metodo que permite comentar el post
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    /**
     * Devuelve el post
     */
    public String getText()
    {
        return message;
    }
    
    /**
     * Metodo que devuelve timestamp
     */
    public long getTimeStamp()
    {
        return timestamp;
    }
    
    /**
     * Metodo que muestra el autor con su post
     */
    public void display()
    {
        System.out.println("Autor: " + username);
        System.out.println("Post : " + message);
        System.out.println("Likes: " + likes);
        System.out.println(timeString(System.currentTimeMillis()));
        int cont = 1;
        for(String comentario:comments){
            System.out.println("Comentario nº" + cont + " : " + comentario);
            cont++;
        }
    }
    
    /**
     * Metodo que muestra por pantalla la antigüedad del post
     */
    private String timeString(long time)
    {
        long tiempo = (time-timestamp)/1000;
        long min = tiempo/60;
        long sec = tiempo-(60*min);
        return ("Hace -> " + min + " min y " + sec + " sec");
    }
}
