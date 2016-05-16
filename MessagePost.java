/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost extends Post
{
    private String message;
    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
       super(author);
       this.message = text;
    }
    
    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getText(){
        return message;
    }
    
    /**
     * Metodo para añadir un comentario al post
     */
    public void addComment(String text){
        getComments().add(text);
    }
    
    public void printShortSummary(){
        System.out.println("Esto es un post de texto creado por " + getAutor());
    }
}