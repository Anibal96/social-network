/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    private String group;
    /**
     * Constructor for objects of class MessagePost
     */
    public JoinGroupPost(String user, String grupo)
    {
       super(user);
       group = grupo;
    }
    
    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getText(){
        return "El usuario " + getUser() + " se unió a tu grupo " + group;
    }
}