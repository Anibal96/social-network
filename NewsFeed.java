import java.util.ArrayList;
/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;
    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        messages = new ArrayList<MessagePost>();
        photos = new ArrayList<PhotoPost>();
    }
    
    /**
     * Añade un post
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }
    
    /**
     * Añade una foto
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }
    
    /**
     * Metodo que muestra los mensajes y las fotos
     */
    public void show()
    {
        for(MessagePost post : messages) {
            post.display();
        }
        
        for(PhotoPost photo : photos) {
            photo.display();
        }
    }
}
