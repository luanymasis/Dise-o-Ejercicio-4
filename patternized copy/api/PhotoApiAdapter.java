import java.util.List;

public interface PhotoApiAdapter {
    List<Photo> searchPhotos(String query);
}