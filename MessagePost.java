/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost extends CommentsPost
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
    
    public void printShortSummary(){
        System.out.println("Esto es un post de texto creado por " + getAutor());
    }
}