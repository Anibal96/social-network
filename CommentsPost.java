import java.util.ArrayList;
/**
 * Write a description of class Comments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommentsPost extends Post
{
    private ArrayList<String> comments;
    /**
     * Constructor for objects of class Comments
     */
    public CommentsPost(String user)
    {
        super(user);
        comments = new ArrayList<String>();
    }
    
    /**
     * Metodo que añade comentarios
     */
    public void addComments(String comentario){
        comments.add(comentario);
    }
    
    /**
     * Metodo que metodo que muestra por pantalla los comentarios del post
     */
    public ArrayList<String> getComments(){
        return comments;
    }
}
